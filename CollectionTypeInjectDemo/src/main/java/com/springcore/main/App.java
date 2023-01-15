package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.Emp;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Emp emp = (Emp)context.getBean("emp");
		System.out.println(emp.getName());
		System.out.println(emp.getAddress());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());
		System.out.println(emp.getMarks());
		System.out.println(emp.getPhones().getClass().getName());
	}
}
