package com.parking.system.movie_ticket_system.database.entity;

import com.parking.system.movie_ticket_system.database.enums.ScreenType;

public class CinemaHall {
     //assumption is that currently hall have similar price seats
     private Long id;
     private String hallNumber;
     private Cinema cinema;
     private Integer capacity;
     private ScreenType[] screenTypes;
}
