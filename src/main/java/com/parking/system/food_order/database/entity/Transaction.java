package com.parking.system.food_order.database.entity;

import java.util.Date;

public class Transaction {
    private Long id;
    private float price;
    private String paymentMethod;
    private Date timeStamp;
    private Long orderId;
}
