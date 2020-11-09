package com.mvc.hibernate.dao;

import java.util.List;
import com.mvc.hibernate.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int cid);

}
