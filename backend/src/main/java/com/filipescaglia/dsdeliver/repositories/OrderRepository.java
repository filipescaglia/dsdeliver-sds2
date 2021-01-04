package com.filipescaglia.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipescaglia.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
