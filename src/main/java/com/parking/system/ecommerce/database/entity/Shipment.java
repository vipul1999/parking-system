package com.parking.system.ecommerce.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.parking.system.ecommerce.database.entity.Order;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Shipment implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shipment_number")
    private String ShipmentNumber;

    @Column(name = "order_id")
    private Order order;

    @Column(name = "customer_id")
    private Customer customer;

    @Column(name = "destination_address")
    private String destinationAddress;

    @OneToMany
    @JsonIgnoreProperties
    private List<ShipmentItem> itemList;
}
