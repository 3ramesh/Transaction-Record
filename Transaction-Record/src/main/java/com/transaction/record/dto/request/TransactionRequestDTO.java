package com.transaction.record.dto.request;

import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequestDTO implements Serializable {

    private String merchantName;

    private Double amount;

    private String merchantAddress;

    private String invoiceNumber;
}
