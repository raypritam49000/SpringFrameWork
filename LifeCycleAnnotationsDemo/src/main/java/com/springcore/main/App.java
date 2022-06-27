package com.springcore.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Student;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student)context.getBean("st1");
		System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
		
		context.registerShutdownHook();
	}
}
