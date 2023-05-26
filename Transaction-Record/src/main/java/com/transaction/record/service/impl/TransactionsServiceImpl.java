package com.transaction.record.service.impl;

import com.transaction.record.dto.request.TransactionRequestDTO;
import com.transaction.record.dto.response.StatusResponseDTO;
import com.transaction.record.dto.response.TransactionListResponseDTO;
import com.transaction.record.module.Transaction;
import com.transaction.record.repository.TransactionRepository;
import com.transaction.record.service.TransactionsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.transaction.record.utils.TransactionUtils.parseToSaveTransaction;
import static com.transaction.record.utils.TransactionUtils.parseToSaveTransactionResponseDTO;

@Service
@Transactional
public class TransactionsServiceImpl implements TransactionsService {

    private final TransactionRepository transactionRepository;

    public TransactionsServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @Override
    public StatusResponseDTO save(TransactionRequestDTO requestDTO) {

        Transaction transaction = saveTransaction(parseToSaveTransaction(requestDTO));

        return parseToSaveTransactionResponseDTO(transaction.getId());
    }

    @Override
    public List<TransactionListResponseDTO> fetchTransactionList() {

        List<TransactionListResponseDTO> responseDTO = transactionRepository.fetchTransactionList();

        return responseDTO;
    }


    private Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
