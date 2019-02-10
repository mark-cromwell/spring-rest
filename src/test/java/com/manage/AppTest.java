package com.manage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.manage.controller.HomeController;

public class AppTest 
{

	@Test
	public void testApp()
    {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "Customer Manager, running ok");
    }
}
