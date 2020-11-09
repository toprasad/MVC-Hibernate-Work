package com.mvc.hibernate.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.hibernate.entity.Customer;
import com.mvc.hibernate.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
//	inject DAO to the controller
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String getCustomersList(Model model) 
	{

//		get Customer from Dao
		List<Customer> theCustomer=customerService.getCustomers();
		
//		add the customers to model
		model.addAttribute("customers",theCustomer);
		
		return "customer-list";
	}
	
	@GetMapping("/showNewForm")
	public String showNewForm(Model model) {
		
		Customer customer= new Customer();
		model.addAttribute("customer",customer);
		
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {

			customerService.saveCustomer(customer);
			return "redirect:/customer/list";
	}
		
	@PostMapping("/updateCustomer")
	public String getEditForm(Model model) {
		//Customer customer= customerService.getCustomer(id);
		  //model.addAttribute("customer",customer);
		  return "customer-form";
	}
}
