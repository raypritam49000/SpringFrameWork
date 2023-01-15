package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.entities.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee employee1 = applicationContext.getBean("employee", Employee.class);
		employee1.setId(124);
		employee1.setName("Pritam Ray");
		employee1.setSalary(40000.0);
		System.out.println(employee1);
		System.out.println(employee1.hashCode());
		
		Employee employee2 = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee2);
		System.out.println(employee2.hashCode());
		((AbstractApplicationContext) applicationContext).close();

	}
}
