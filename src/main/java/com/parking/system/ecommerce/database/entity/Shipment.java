package com.parking.system.ecommerce.database.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ShipmentNumber;
    private String orderId;
    private String userId;
    private String destinationAddress;
    private List<ShipmentItem> itemList;
}
