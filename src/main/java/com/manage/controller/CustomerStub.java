package com.manage.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.manage.model.Customer;

@Repository
public class CustomerStub {
	private static Map<Long, Customer> customers = new HashMap<Long, Customer>();
	private static Long idIndex = 3L;

	//populate initial customers
	static {
		Customer a = new Customer(1L, "John", "Smith");
		customers.put(1L, a);
		Customer b = new Customer(2L, "Bill", "Bloggs");
		customers.put(2L, b);
		Customer c = new Customer(3L, "Janice", "Battersby");
		customers.put(3L, c);
	}

	public static List<Customer> list() {
		return new ArrayList<Customer>(customers.values());
	}

	public Customer create(Customer customer) {
		idIndex = customer.getId();
		customers.put(idIndex, customer);
		return customer;
	}

	public Customer get(Long id) {
		return customers.get(id);
	}

	public Customer delete(Long id) {
		return customers.remove(id);
	}
}
