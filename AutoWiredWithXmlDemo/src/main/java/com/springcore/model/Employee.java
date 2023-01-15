package com.springcore.model;

public class Employee {
	private Address address;

	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Hello Pritam Ray....");
	}

	public Employee() {
		super();

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return ""+this.address;
	}
	
	

}
