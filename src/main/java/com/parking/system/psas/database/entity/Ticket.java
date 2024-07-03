package com.parking.system.psas.database.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "vehicle_registration_number")
    private String vehicleRegistrationNumber;
    @Column(name = "arrival_time")
    private LocalDateTime arrivalTime;
}
