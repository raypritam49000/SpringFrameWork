package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.beans.A;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a);
		System.out.println("x = "+a.getX());
		System.out.println("y = "+a.getB().getY());

	}
}
