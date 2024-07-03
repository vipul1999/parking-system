package com.parking.system.ecommerce.database.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "sellers")
public class Seller extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(
            mappedBy = "seller",
            orphanRemoval = true
    )
    List<Product> productList = new ArrayList<>();
}
