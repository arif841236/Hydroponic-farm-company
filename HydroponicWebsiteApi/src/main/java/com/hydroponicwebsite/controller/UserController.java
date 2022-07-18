package com.hydroponicwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hydroponicwebsite.entity.Customer;
import com.hydroponicwebsite.entity.Login;
import com.hydroponicwebsite.entity.User;
import com.hydroponicwebsite.repository.UserDao;
import com.hydroponicwebsite.service.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	  UserDao uDao;

	  @Autowired
	  UserServiceImpl uService;
	  
	  @PostMapping("/user")
	  public UserDetails addUserHandler(@PathVariable("username") String user) {
	    
	    	return uService.loadUserByUsername(user);

	  }

	  
	  

	  
	  
	  
	  
	  
	
}
