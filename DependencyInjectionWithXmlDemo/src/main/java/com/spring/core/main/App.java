package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getMarks());
		System.out.println(student.getQusAns());
		System.out.println(student.getPhone());
		System.out.println(student.getSalary());
		System.out.println(student.getSubject());
		System.out.println(student.getCourse());
		
	}
}
