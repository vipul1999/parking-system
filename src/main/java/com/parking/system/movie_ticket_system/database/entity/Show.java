package com.parking.system.movie_ticket_system.database.entity;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

/*
*/
public class Show {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private CinemaHall cinemaHall;
}
