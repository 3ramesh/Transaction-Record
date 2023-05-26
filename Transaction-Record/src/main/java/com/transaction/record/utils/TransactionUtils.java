package com.transaction.record.utils;

import com.transaction.record.dto.request.TransactionRequestDTO;
import com.transaction.record.dto.response.StatusResponseDTO;
import com.transaction.record.module.Transaction;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.transaction.record.constant.StatusConstant.ACTIVE;
import static org.springframework.http.HttpStatus.OK;

public class TransactionUtils {

    public static Transaction parseToSaveTransaction(TransactionRequestDTO requestDTO) {

        Transaction transaction = new Transaction();
        transaction.setMerchantName(requestDTO.getMerchantName());
        transaction.setAmount(requestDTO.getAmount());
        transaction.setTransactionDateTime(new Date());
        transaction.setMerchantAddress(requestDTO.getMerchantAddress());
        transaction.setInvoiceNumber(requestDTO.getInvoiceNumber());
        transaction.setStatus(ACTIVE);

        return transaction;
    }

    public static StatusResponseDTO parseToSaveTransactionResponseDTO(Long transactionId) {

        Map<String, Object> data = new HashMap<>();
        data.put("transactionId", transactionId);

        StatusResponseDTO responseDTO = new StatusResponseDTO();
        responseDTO.setData(data);
        responseDTO.setResponseCode(OK.value());
        responseDTO.setResponseStatus(OK);

        return responseDTO;
    }

}
