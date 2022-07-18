package com.hydroponicwebsite.service;

import java.util.List;
import java.util.UUID;

import com.hydroponicwebsite.entity.Admin;
import com.hydroponicwebsite.exception.AdminException;

public interface AdminService {

	public Admin registerAdmin(Admin admin);
	
	public List<Admin> adminList() throws AdminException;
	
	public Admin getAdmin(UUID id)throws AdminException;
	
	public Admin getAdminByLogin(String login) throws AdminException;
		
	
	
	
}
