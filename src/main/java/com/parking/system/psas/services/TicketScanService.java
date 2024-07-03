package com.parking.system.psas.services;

import com.parking.system.psas.database.entity.Ticket;
import com.parking.system.psas.database.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TicketScanService {

    @Autowired
    TicketRepository ticketRepository;

    public void scanTicket(){

    }

    public void createTicket(Ticket ticket){
        ticket.setArrivalTime(LocalDateTime.now());
        saveTicket(ticket);
    }

    public void saveTicket(Ticket ticket){
        ticketRepository.save(ticket);
    }

    public Ticket findById(Integer id){
        return ticketRepository.findById(id);
    }


}
