package com.mvc.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.hibernate.dao.CustomerDAO;
import com.mvc.hibernate.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
	customerDAO.saveCustomer(customer);	
	}

	@Override
	@Transactional
	public Customer getCustomer(int cid) {
		Customer customer=customerDAO.getCustomer(cid);
		return customer;
	}

}
