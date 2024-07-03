package com.parking.system.ecommerce.database.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_number")
    private String orderNumber;
    @Column(name = "user_id")
    private Customer userId;
}
