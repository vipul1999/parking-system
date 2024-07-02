package com.javaConcepts.interviewPrep.database.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String vehicleRegistrationNumber;
    private LocalDateTime arrivalTime;


}
