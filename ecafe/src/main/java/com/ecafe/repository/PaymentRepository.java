package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecafe.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Long>{

}
