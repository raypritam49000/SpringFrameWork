package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.model.Student;
import com.springcore.model.StudentConfig;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		//Student student = context.getBean("student",Student.class);
		Student student = context.getBean("getStudent",Student.class);
		System.out.println(student);
		student.show();
	}
}
