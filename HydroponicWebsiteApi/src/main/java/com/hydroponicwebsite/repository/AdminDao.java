package com.hydroponicwebsite.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hydroponicwebsite.entity.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, UUID>  {

	public Admin findByLoginId(String loginId);
	
}
