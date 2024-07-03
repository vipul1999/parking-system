package com.parking.system.psas.database.repository;

import com.parking.system.psas.database.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Ticket findById(Integer id);
}
