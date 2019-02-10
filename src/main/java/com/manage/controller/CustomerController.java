package com.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manage.model.Customer;

@RestController
@RequestMapping("api/")
public class CustomerController {

	@Autowired
	CustomerStub customerStub; 
	
	@RequestMapping(value = "customers", method = RequestMethod.GET)
	public List<Customer> list() {
		return CustomerStub.list();
	}
	
	@RequestMapping(value = "customers", method = RequestMethod.POST)
	public Customer create(@RequestBody Customer customer) {
		return customerStub.create(customer);
	}
	
	@RequestMapping(value = "customers/{id}", method = RequestMethod.GET)
	public Customer get(@PathVariable Long id) {
		return customerStub.get(id);
	}
	
	@RequestMapping(value = "customers/{id}", method = RequestMethod.DELETE)
	public Customer delete(@PathVariable Long id) {
		return customerStub.delete(id);
	}
	
}
