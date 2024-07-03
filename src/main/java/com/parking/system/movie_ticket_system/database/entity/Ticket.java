package com.parking.system.movie_ticket_system.database.entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import java.util.List;

public class Ticket {
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "show_id")
    private Show show;

    private float price;

    private List<String> seatsBooked;
}
