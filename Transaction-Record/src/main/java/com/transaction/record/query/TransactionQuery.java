package com.transaction.record.query;

public class TransactionQuery {

    public static String QUERY_TO_FETCH_TRANSACTION_LIST(){

        String qry = " SELECT" +
                " t.id as transactionId," +
                " t.merchantName as merchantName," +
                " t.amount as amount," +
                " t.transactionDateTime as transactionDateTime," +
                " t.merchantAddress as MerchantAddress," +
                " t.invoiceNumber as invoiceNumber" +
                " FROM Transaction t" +
                " WHERE" +
                " t.status!='D'";

        return qry;
    }
}
