package com.parking.system.GooglePay.database.entity;

import com.parking.system.GooglePay.Enums.PaymentMethod;

public class UserPaymentMethodInfo {
    private Long id;
    private PaymentMethod paymentMethodType;// credit_card, bank_account, upi
    private Long userId;
    private String tokenized_Data;
    private boolean defaultPaymentMethod;

    //
}
