package com.springcore.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {

	@Bean(name="person")
	public Person getPerson() {
		Person person = new Person();
		person.setName("Pritam Ray");
		person.setAge(38);
		person.setCity("Ropar");
		person.setMobile("8699535682");
		
		return  person;
	}
	
}
