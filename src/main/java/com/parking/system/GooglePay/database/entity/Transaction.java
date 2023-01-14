package com.parking.system.GooglePay.database.entity;

import com.parking.system.GooglePay.Enums.PaymentMethod;
import com.parking.system.GooglePay.Enums.TransactionStatus;

public class Transaction {

    private Long id;
    private Long senderId;
    private Long receiverId;
    private String paymentDesc;
    private PaymentMethod modeOfPaymentEnum;
    private TransactionStatus paymentStatusEnum;
    private double amount;

    //fetchUserTransactionHistory

    //send money to a user (and search by mobile number)
        //referral program can be designed

    //pay to merchant

    //request money from a number



}
