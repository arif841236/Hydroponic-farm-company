package com.hydroponicwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hydroponicwebsite.entity.Admin;
import com.hydroponicwebsite.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admins")
	public ResponseEntity<Admin> registerAdminDetails(@RequestBody Admin admin) {
		
		Admin admins=adminService.registerAdmin(admin);
		return new ResponseEntity<Admin>(admins,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/admins")
	public List<Admin> getAllAdmin(){
		return adminService.adminList();
	}
}
