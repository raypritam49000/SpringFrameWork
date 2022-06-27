package com.spring.core.model;

public class Address {
	private String city;
	private String street;
	private String state;
	private String country;

	public Address(String city, String street, String state, String country) {
		super();
		this.city = city;
		this.street = street;
		this.state = state;
		this.country = country;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", state=" + state + ", country=" + country + "]";
	}

}
