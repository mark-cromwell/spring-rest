package com.manage.model;

public class Customer {
	Long id;
	String firstName;
	String surName;

	public Customer() { }

	public Customer(Long id, String firstName, String surName) {
		this.id = id;
		this.firstName = firstName;
		this.surName = surName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

}
