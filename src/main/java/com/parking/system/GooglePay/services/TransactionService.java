package com.parking.system.GooglePay.services;

public class TransactionService {
    /*
    1. When a transaction is initiated,
        - an entry is created in the Transactions Table with a pending status.
    2. check in loop after every x minutes -->
        if transaction is failed even after x minute of time,
            then mark it failed
        rollback
            - new entry or not in this table
            - settlement of funds
        notify user (this can be integrated as cdc on transaction table)
    3. The payment gateway processes the transaction and
        -sends a callback to the server(callback handler) with the transaction result.
        -there will be a callback handler open and server end who will be listening to this pg request
        -payment gateway will be third party service
            -they will expose their api to us
            - we will be listening to their callback of payment status

     */
}
