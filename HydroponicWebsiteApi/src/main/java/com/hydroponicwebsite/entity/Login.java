package com.hydroponicwebsite.entity;

import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



public class Login implements UserDetails {

	private final User u ;
	public Login(User u) {
		this.u = u;
		}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(()-> "read");
	}

	@Override
	public String getPassword() {
		return u.getPassword();
	}

	@Override
	public String getUsername() {
		return u.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	

	
	
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Integer loginId;
//	public Login(String username, String password) {
//		super();
//		this.username = username;
//		this.password = password;
//	}
//	private String username;
//	private String password;
	

}
