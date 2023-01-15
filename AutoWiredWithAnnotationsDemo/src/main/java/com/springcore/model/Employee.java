package com.springcore.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	@Autowired  //(byType)
	@Qualifier("address1")
	private Address address;

	//@Autowired  //(Constuctor Injection)
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Calling Constructor....");
	}

	public Employee() {
		super();

	}

	public Address getAddress() {
		return address;
	}
    
	 //@Autowired   //(Property Injection)
	public void setAddress(Address address) {
		System.out.println("Setting value..");
		this.address = address;
	}

	@Override
	public String toString() {
		return ""+this.address;
	}
	
	

}
