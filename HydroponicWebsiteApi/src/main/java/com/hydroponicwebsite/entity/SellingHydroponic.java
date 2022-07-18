package com.hydroponicwebsite.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class SellingHydroponic {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer sellingId;
	
	@Column(name="type")
	private String infraType;
	
	@Column(name="seller_name")
	private String sellerName;
	
	@Column(name="buyer_name")
	private String buyerName;
	
	@Column(name="selling_type")
	private String sellingType;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
}
