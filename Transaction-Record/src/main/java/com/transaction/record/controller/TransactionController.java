package com.transaction.record.controller;

import com.transaction.record.dto.request.TransactionRequestDTO;
import com.transaction.record.service.TransactionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.transaction.record.constant.SwaggerConstants.BatteryConstant.*;
import static com.transaction.record.constant.WebResourceKeyConstants.API;
import static com.transaction.record.constant.WebResourceKeyConstants.TransactionConstants.BASE_TRANSACTION;
import static java.net.URI.create;
import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.ok;


@RestController
@RequestMapping(value = API + BASE_TRANSACTION)
@Api(BASE_API_VALUE)
public class TransactionController {

    private final TransactionsService transactionsService;


    public TransactionController(TransactionsService transactionsService) {
        this.transactionsService = transactionsService;
    }

    //Add transaction to DB

    @PostMapping
    @ApiOperation(SAVE_OPERATION)
    public ResponseEntity<?> save(@RequestBody TransactionRequestDTO requestDTO) {
        transactionsService.save(requestDTO);
        return created(create(API + BASE_TRANSACTION)).build();
    }

    //Fetch list of Item

    @GetMapping()
    @ApiOperation(FETCH_OPERATION)
    public ResponseEntity<?> fetchTransactionList() {
        return ok().body(transactionsService.fetchTransactionList());
    }

}

