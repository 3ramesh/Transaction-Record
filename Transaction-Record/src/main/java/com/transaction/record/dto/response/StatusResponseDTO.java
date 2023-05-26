package com.transaction.record.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatusResponseDTO implements Serializable {

    private int responseCode;

    private HttpStatus responseStatus;

    private Map<String, ?> data;
}
