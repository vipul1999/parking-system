package com.parking.system.ecommerce.database.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.mapping.Join;


@Entity
@Data
public class ItemStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "quantity")
    private Integer quantity;
}
