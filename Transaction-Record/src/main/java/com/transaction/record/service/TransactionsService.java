package com.transaction.record.service;

import com.transaction.record.dto.request.TransactionRequestDTO;
import com.transaction.record.dto.response.StatusResponseDTO;
import com.transaction.record.dto.response.TransactionListResponseDTO;

import java.util.List;

public interface TransactionsService {

    StatusResponseDTO save(TransactionRequestDTO requestDTO);

    List<TransactionListResponseDTO> fetchTransactionList();


}
