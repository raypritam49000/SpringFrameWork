package com.springcore.beans;

public class Person {
	private String name;
	private int age;
	private String city;
	private String mobile;

	public Person(String name, int age, String city, String mobile) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.mobile = mobile;
	}

	public Person() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}