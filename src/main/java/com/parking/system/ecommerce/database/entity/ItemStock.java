package com.parking.system.ecommerce.database.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class ItemStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Product product;
    private Integer quantity;
}
