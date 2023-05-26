package com.transaction.record.repository.custom;

import com.transaction.record.dto.response.TransactionListResponseDTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("TransactionRepositoryCustom")
public interface TransactionRepositoryCustom {

    List<TransactionListResponseDTO> fetchTransactionList();


}
