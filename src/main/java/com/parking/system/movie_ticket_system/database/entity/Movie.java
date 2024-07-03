package com.parking.system.movie_ticket_system.database.entity;

import com.parking.system.movie_ticket_system.database.enums.Genre;
import com.parking.system.movie_ticket_system.database.enums.Language;
import com.parking.system.movie_ticket_system.database.enums.ScreenType;

public class Movie {
    private String movieName;
    private String movieTrailerUrl;
    private String movieRunTime;
    private float movieRating;
    private String[] cast;
    private Language[] languages;
    private Genre[] Genre;
    private ScreenType[] availableFormate;
}
