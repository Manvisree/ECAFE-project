package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecafe.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
