package com.hydroponicwebsite.service;

import java.util.List;

import com.hydroponicwebsite.entity.Customer;
import com.hydroponicwebsite.exception.CustomerException;

public interface CustomerService {

     public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer)throws CustomerException;
	
	public Customer removeCustomer(Integer customerId)throws CustomerException;
	
	public Customer viewCustomer(Integer customerId)throws CustomerException;
	
	public List<Customer> viewAllCustomers()throws CustomerException;
	
}
