package com.spring.core.model;

import java.util.List;

public class User {
	private int id;
	private String name;
	private String age;
	private double salary;
	private List<String>phone;

	public User(int id, String name, String age, double salary,List<String>phone) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
		System.out.println("Constructor Injection....");
	}

	public User() {
		super();
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", phone=" + phone + "]";
	}


}
