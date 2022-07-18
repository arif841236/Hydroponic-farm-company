package com.hydroponicwebsite.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer useIid;
	
	 @Column(name = "email")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",message = "Email is not valid")
	@NotEmpty(message = "Email cannot be empty")
	private String email;
	
	@Column(name = "mobile")
	@Size(min=10, max=10,message="Mobile number shuld be 10 digit.. ")
	private String mobile;
	
	@Column(name = "username")
	@NotBlank(message="username is mandatory")
	private String username;
	

	
	@Column(name = "password")
	@NotBlank(message="password is mandatory")
	private String password;

}
