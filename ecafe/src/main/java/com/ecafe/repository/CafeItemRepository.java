package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecafe.entity.CafeItem;
import com.ecafe.service.IManagerService;
@Repository
public interface CafeItemRepository extends JpaRepository<CafeItem, Long>{
	

}
