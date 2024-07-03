package com.parking.system.ecommerce.database.entity;

import com.parking.system.ecommerce.ecom_enum.UserType;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Join;
import lombok.Data;

import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@Table(name = "users")
public abstract class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String address;

    private String mobileNumber;
}
