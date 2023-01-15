package com.spring.mvc.model;

public class User {
	private String email;
	private String password;
	private String phone;
	private String name;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password, String phone, String name) {
		super();
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", phone=" + phone + ", name=" + name + "]";
	}

}
