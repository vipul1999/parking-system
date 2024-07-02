package com.javaConcepts.interviewPrep.database.repository;

import com.javaConcepts.interviewPrep.database.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findById(Integer id);
}