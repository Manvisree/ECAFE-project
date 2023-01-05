package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecafe.entity.CafeCombo;
@Repository
public interface CafeComboRepository extends JpaRepository<CafeCombo,Long>{

}
