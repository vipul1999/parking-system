package com.javaConcepts.interviewPrep.services;

import com.javaConcepts.interviewPrep.database.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketScanService {

    @Autowired
    TicketRepository ticketRepository;

    public void scanTicket(){

    }

}