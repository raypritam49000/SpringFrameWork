package com.spring.core.entities;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {
	private int id;
	private String name;
	private double salary;
	private String city;

	public User(int id, String name, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Set Id...");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Set Name...");
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		System.out.println("Set Salary...");
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public void init() {
		System.out.println("Called Init Method...");
	}
	
	public void destory() {
		System.out.println("Called Destroy Method...");
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

}
