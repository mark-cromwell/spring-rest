package com.manage;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.manage.controller.CustomerController;
import com.manage.controller.CustomerStub;
import com.manage.model.Customer;

public class CustomerControllerTest {

	@InjectMocks
	private CustomerController cc;
	
	@Mock
	private CustomerStub customerStub;


	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCustomerGet()
    {
		Customer a = new Customer(1L, "John", "Smith");
		when(customerStub.get(1L)).thenReturn(a);
		
		Customer customer = cc.get(1L);
		assertEquals(1L, customer.getId().longValue());
    }
	
	@Test
	public void testCustomerPost()
    {
		Customer a = new Customer(20L, "Dave", "Bennett");
		when(customerStub.create(a)).thenReturn(a);
		
		Customer customer = cc.create(a);
		
		assertEquals(20L, customer.getId().longValue());
		assertEquals("Dave", customer.getFirstName());
		assertEquals("Bennett", customer.getSurName());
    }
	
	@Test
	public void testCustomerDelete()
    {
		Customer a = new Customer(30L, "Barry", "John");
		when(customerStub.delete(30L)).thenReturn(null);
		
		Customer customer = cc.delete(30L);
		
		assertNull(customer);
    }
}
