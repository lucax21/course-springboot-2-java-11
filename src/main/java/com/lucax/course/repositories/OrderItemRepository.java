package com.lucax.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucax.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
