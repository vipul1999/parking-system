package com.parking.system.ecommerce.database.entity;

import com.parking.system.ecommerce.ecom_enum.ProductCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ProductCategory productCategory;
    private Seller seller;
    private Double price;

}
