package com.hydroponicwebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hydroponicwebsite.entity.SellingHydroponic;

@Repository
public interface SellerDao extends JpaRepository<SellingHydroponic, Integer> {

}
