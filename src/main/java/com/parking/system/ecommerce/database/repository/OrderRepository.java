package com.parking.system.ecommerce.database.repository;

import com.parking.system.ecommerce.database.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
