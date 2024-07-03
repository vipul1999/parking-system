package com.parking.system.ecommerce.database.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ShipmentNumber;
    private Order order;
    private User user;
    private String destinationAddress;
    private List<ShipmentItem> itemList;
}
