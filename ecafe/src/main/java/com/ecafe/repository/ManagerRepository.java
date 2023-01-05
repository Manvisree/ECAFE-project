package com.ecafe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecafe.entity.AppUser;
import com.ecafe.enumeration.Role;

@Repository
public interface ManagerRepository extends JpaRepository<AppUser,Role >{
	
	

}
