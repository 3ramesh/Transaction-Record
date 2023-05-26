package com.transaction.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Before the run application create database with name "transaction_records" also see application.properties files.
 * All Api are successfully run and implement in Swagger.
 * Just run: http://localhost:8080/transaction-records/swagger-ui.html on browser and test application after fully running application.
 */

@SpringBootApplication
public class TransactionRecordApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionRecordApplication.class, args);
    }

}
