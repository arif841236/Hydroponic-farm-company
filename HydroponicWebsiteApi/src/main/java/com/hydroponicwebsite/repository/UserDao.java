package com.hydroponicwebsite.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hydroponicwebsite.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	public User findByUsernameAndPassword(String username, String password);
	public User findByMobile(String mobile);
	public Optional<User> findByUsername(String username);
	
}
