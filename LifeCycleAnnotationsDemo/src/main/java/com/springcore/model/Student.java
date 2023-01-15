package com.springcore.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Name");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting Age");
		this.age = age;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method.. ");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Inside destroy method.. ");
	}

}
