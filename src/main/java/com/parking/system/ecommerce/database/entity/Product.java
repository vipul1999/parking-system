package com.parking.system.ecommerce.database.entity;

import com.parking.system.ecommerce.ecom_enum.ProductCategory;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ProductCategory productCategory;
    private Long sellerId;
    private Double price;

}
