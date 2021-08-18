package com.example.stringenumconvertershowcase.jpa.repository;

import com.example.stringenumconvertershowcase.jpa.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
