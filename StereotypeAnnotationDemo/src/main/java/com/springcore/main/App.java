package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Person;
import com.springcore.model.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person person = context.getBean("ob", Person.class);
		System.out.println(person.hashCode());
		System.out.println(person.getPhones());
		System.out.println(person.getPhones().getClass().getName());
		Person person1 = context.getBean("ob", Person.class);
		System.out.println(person1.hashCode());

		Student student1 = context.getBean("student", Student.class);
		System.out.println(student1.hashCode());
		
		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2.hashCode());

	}
}
