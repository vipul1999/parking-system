package com.parking.system.psas.controller;

import com.parking.system.psas.database.entity.Ticket;
import com.parking.system.psas.services.TicketScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketScanController {

    @Autowired
    TicketScanService ticketScanService;
    // Example endpoint to handle HTTP GET requests
    @GetMapping("/{ticketId}")
    public String getTicketDetails(@PathVariable Integer ticketId) {
        // Replace with your logic to fetch ticket details from service or repository
        Ticket ticket = ticketScanService.findById(ticketId);
        if(ObjectUtils.isEmpty(ticket)){
            return "Ticket Not found!";
        }
        return "Ticket ID: " + ticket.toString() + " details retrieved successfully.";
    }

    // Example endpoint to handle HTTP POST requests
    @PostMapping("/create")
    public String createTicket(@RequestBody Ticket ticket) {
        // Replace with your logic to create a new ticket
        ticketScanService.createTicket(ticket);
        return "Ticket created successfully: " + ticket.toString();
    }

    // Example endpoint to handle HTTP PUT requests
    @PutMapping("/{ticketId}")
    public String updateTicket(@PathVariable Long ticketId, @RequestBody Ticket ticket) {
        // Replace with your logic to update an existing ticket
        return "Ticket ID: " + ticketId + " updated successfully.";
    }

    // Example endpoint to handle HTTP DELETE requests
    @DeleteMapping("/{ticketId}")
    public String deleteTicket(@PathVariable Long ticketId) {
        // Replace with your logic to delete a ticket
        return "Ticket ID: " + ticketId + " deleted successfully.";
    }
}
