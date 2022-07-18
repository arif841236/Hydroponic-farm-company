package com.hydroponicwebsite.service;

import java.util.List;
import java.util.Optional;

import org.apache.tomcat.util.json.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hydroponicwebsite.entity.Login;
import com.hydroponicwebsite.entity.User;
import com.hydroponicwebsite.exception.UserException;

import com.hydroponicwebsite.repository.UserDao;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	UserDao uDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user =uDao.findByUsername(username);
		User u =user.orElseThrow(() -> new UserException("User not found.."));
		return new Login(u);
	}

//	@Autowired
//	private UserDao uDao;
//	
//	@Autowired
//	private LoginDao lDao;
//	
//
//
//	@Override
//	public User addUser(User user) {
//		User users = uDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//	    if(users==null) {
//	    	return uDao.save(user);
//	    }
//	    else {
//	    	throw new UserException("User Existed..");
//	    }
//	}
//
//
//	
//	@Override
//	public String loginUser(String username,String password) {
//		
//		User existUser=uDao.findByUsernameAndPassword(username, password);
//		
//		if(existUser==null) {
//			throw new UserException("User not register..");
//		}
//		else {
//			return "successfully login...";
//		}
//		
//		
//	}
//	
//
//	@Override
//	public User removeUser(String username, String password) throws UserException {
//		
//		User existing=uDao.findByUsernameAndPassword(username, password);
//		if(existing==null) {
//			throw new UserException("user not found ....");
//		}
//		else {
//			uDao.delete(existing);
//			
//		}
//		
//		
//		return existing;
//	}
//
//	@Override
//	public User signOut(Login userLogin) throws UserException {
//		
//		User existing=uDao.findByUsernameAndPassword(userLogin.getUsername(), userLogin.getPassword());
//		if(existing!=null) {
//			 lDao.delete(userLogin);
//			 return existing;
//			
//		}
//		else {
//			throw new UserException("User dose not exist...");
//		}
//		
//	}
//
//	@Override
//	public List<User> getAllUser() throws UserException {
//		List<User> user=uDao.findAll();
//		if(user.size()>0) {
//			return user;
//		}
//		else {
//			throw new UserException("Any user dose not exist...");
//		}
//		
//	}
//
//
//
//	@Override
//	public User updateUsername(String mobile, String newusername) throws UserException {
//		
//		User user= uDao.findByMobile(mobile);
//		if(user!=null) {
//			
//			user.setUsername(newusername);
//			uDao.save(user);
//			return user;
//		}
//		else {
//			throw new UserException("User dose not exist..");
//		}
//	}
//
//
//
//	@Override
//	public User updatePassword(String username,String mobile, String newpassword) throws UserException {
//		User user=uDao.findByUsername(username);
//		if(user!=null && user.getMobile().equals(mobile)) {
//			
//			user.setPassword(newpassword);
//			uDao.save(user);
//			return user;
//		}
//		else {
//			throw new UserException("User dose not exist..");
//		}
//	}
//
//	

	
	
}
