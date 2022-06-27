package com.spring.core.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.model.Employee;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee employee = ctx.getBean("employee", Employee.class);
		System.out.println(employee);
		ctx.close();
	}
}
