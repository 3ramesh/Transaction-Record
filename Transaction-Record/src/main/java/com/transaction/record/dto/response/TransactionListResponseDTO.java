package com.transaction.record.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class TransactionListResponseDTO implements Serializable {

    private Long transactionId;

    private String merchantName;

    private Double amount;

    private Date transactionDateTime;

    private String merchantAddress;

    private String invoiceNumber;

}
