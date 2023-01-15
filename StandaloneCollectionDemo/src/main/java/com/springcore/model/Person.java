package com.springcore.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> fees;
	private Properties salary;

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public Person() {
		super();
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Properties getSalary() {
		return salary;
	}

	public void setSalary(Properties salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + ", salary=" + salary + "]";
	}

}
