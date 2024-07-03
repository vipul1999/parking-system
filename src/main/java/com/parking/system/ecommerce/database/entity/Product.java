package com.parking.system.ecommerce.database.entity;

import com.parking.system.ecommerce.ecom_enum.ProductCategory;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_category")
    private ProductCategory productCategory;

    @Column(name = "seller_id")
    private Seller seller;

    @Column(name = "price")
    private Double price;

}
