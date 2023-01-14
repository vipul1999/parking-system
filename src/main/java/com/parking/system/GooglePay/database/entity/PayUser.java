package com.parking.system.GooglePay.database.entity;


import java.util.List;

public abstract class PayUser {
    private Long userId;
    private String email;
    private String phoneNumber;
    private String password_hash;
    List<BankAccount> bankAccountList;
    List<UserPaymentMethodInfo> userPaymentMethodInfos;

    //register and login

    //update info

    //add payment_method

    //update payment_method

    //remove payment_method

    //getPaymentMethod

    //fetchUserTransactionHistory


}
