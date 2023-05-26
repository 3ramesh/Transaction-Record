package com.transaction.record.repository.custom.impl;

import com.transaction.record.dto.response.TransactionListResponseDTO;
import com.transaction.record.repository.custom.TransactionRepositoryCustom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

import static com.transaction.record.query.TransactionQuery.QUERY_TO_FETCH_TRANSACTION_LIST;
import static com.transaction.record.utils.QueryUtils.createQuery;
import static com.transaction.record.utils.QueryUtils.transformQueryToResultList;

@Repository
@Transactional(readOnly = true)
@Slf4j
public class TransactionRepositoryCustomImpl implements TransactionRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<TransactionListResponseDTO> fetchTransactionList() {

        Query query = createQuery.apply(entityManager, QUERY_TO_FETCH_TRANSACTION_LIST());

        try {
            return transformQueryToResultList(query, TransactionListResponseDTO.class);
        } catch (NoResultException e) {
            return new ArrayList<>();
        }


    }
}
