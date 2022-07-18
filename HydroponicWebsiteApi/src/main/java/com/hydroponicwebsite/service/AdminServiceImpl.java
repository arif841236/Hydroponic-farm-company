package com.hydroponicwebsite.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hydroponicwebsite.entity.Admin;
import com.hydroponicwebsite.exception.AdminException;
import com.hydroponicwebsite.repository.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;
	
	@Override
	public Admin registerAdmin(Admin admin) {
		
		Admin admins=adminDao.save(admin);
		return admins;
	}

	@Override
	public List<Admin> adminList() {
		List<Admin> admins=adminDao.findAll();
		if(admins.size()>0) {
			return admins;
		}
		else {
			throw new AdminException("No any UUID...");
		}
	}

	@Override
	public Admin getAdmin(UUID id) {
		Optional<Admin> admin=adminDao.findById(id);
		if(admin.isPresent()) {
			return admin.get();
		}
		else {
			throw new AdminException("Admin not found....with uuid :"+id);
		}
	}

	@Override
	public Admin getAdminByLogin(String login) throws AdminException {
		Admin admin= adminDao.findByLoginId(login);
		if(admin!=null) {
			return admin;
		}
		else {
			throw new AdminException("Admin not found....");
		}
	}

}