package com.hydroponicwebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hydroponicwebsite.entity.HydroFarmInfrastructure;

@Repository
public interface HydroFarmDao extends JpaRepository<HydroFarmInfrastructure, Integer> {

}
