package com.hydroponicwebsite.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer customerId;
	@Column(name = "name")
	@NotBlank(message="name is mandatory")
	private String customerName;
	
	@Column(name = "mobile")
	@Size(min=10, max=10,message="Mobile number shuld be 10 digit.. ")
	private String mobileNumber;
	
 
	
}
