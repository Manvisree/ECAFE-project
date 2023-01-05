package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecafe.entity.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder,Long> {

}
