package com.mvc.hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mvc.hibernate.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	//	Need to inject session factory

	@Autowired
	private SessionFactory sessionFactory ;
	
	@Override
	public List<Customer> getCustomers() {
		
//		get Current hibernate sessison
		Session currentSession=sessionFactory.getCurrentSession();		
		
		@SuppressWarnings("unchecked")
		List<Customer> customers=currentSession.createQuery("from Customer").getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
	
		Session currentSession=sessionFactory.getCurrentSession();	
		currentSession.saveOrUpdate(customer);
	}

	@Override
	public Customer getCustomer(int cid) {
		Session currentSession=sessionFactory.getCurrentSession();	
		Customer customer=currentSession.get(Customer.class, cid);
		return customer;
	}

}
