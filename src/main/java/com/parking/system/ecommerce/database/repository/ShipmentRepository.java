package com.parking.system.ecommerce.database.repository;

import com.parking.system.ecommerce.database.entity.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment,Long> {
}
