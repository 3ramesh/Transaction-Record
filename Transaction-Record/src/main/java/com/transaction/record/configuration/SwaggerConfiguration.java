package com.transaction.record.configuration;

import com.transaction.record.constant.SwaggerConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(SwaggerConstants.BASE_PACKAGE))
                .paths(PathSelectors.regex(SwaggerConstants.PATH_REGEX))
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        return new ApiInfo(
                "Monthly Transaction System (Application)",
                "About: " + "REST API in spring boot",
                "V1",
                "",
                new Contact(
                        "Developer",
                        "",
                        ""),
                "",
                "",
                java.util.Collections.emptyList());
    }
}
