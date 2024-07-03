package com.parking.system.ecommerce.database.entity;

import com.parking.system.ecommerce.ecom_enum.ShipmentStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "shipment_history")
public class ShipmentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Order order;
    private Shipment shipment;
    private ShipmentStatus shipmentStatus;
}
