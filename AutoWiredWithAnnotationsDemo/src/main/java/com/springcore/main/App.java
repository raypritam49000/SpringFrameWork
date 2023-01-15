package com.springcore.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Employee;


public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = context.getBean("employee",Employee.class);
		
		System.out.println("City : "+employee.getAddress().getCity());
		System.out.println("State : "+employee.getAddress().getState());
		System.out.println("Country : "+employee.getAddress().getCountry());
	
		
	}
}
