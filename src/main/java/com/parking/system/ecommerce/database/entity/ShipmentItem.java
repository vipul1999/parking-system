package com.parking.system.ecommerce.database.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ShipmentItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "shipment_id")
    private Shipment shipment;

    @Column(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private Integer quantity;
}
