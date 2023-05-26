package com.transaction.record.module;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "transaction")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "merchant_name")
    private String merchantName;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "transaction_date_time")
    private Date transactionDateTime;

    @Column(name = "merchant_address")
    private String merchantAddress;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "status")
    private Character status;

    @Column(name = "remarks")
    private String remarks;

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", merchantName='" + merchantName + '\'' +
                ", amount=" + amount +
                ", transactionDateTime=" + transactionDateTime +
                ", merchantAddress='" + merchantAddress + '\'' +
                ", invoiceNumber='" + invoiceNumber + '\'' +
                ", status=" + status +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
