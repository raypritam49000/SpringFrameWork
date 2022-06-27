package com.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.services.PaymentService;
import com.spring.services.PaymentServiceImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		PaymentService paymentService = context.getBean("payment", PaymentServiceImpl.class);
	  
		// auth: payment started
		paymentService.makePayment(4500);
	}
}
