package com.mvc.hibernate.service;

import java.util.List;

import com.mvc.hibernate.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int cid);
}
