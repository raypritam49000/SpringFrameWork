package com.spring.core.model;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private String panNo;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String gender, String panNo) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.panNo = panNo;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", panNo=" + panNo + "]";
	}

}
