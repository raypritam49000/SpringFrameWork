package com.spring.core.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.model.Message;

public class App {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("config.xml");
		Message message = beanFactory.getBean("message",Message.class);
		System.out.println(message);
		((AbstractApplicationContext)beanFactory).registerShutdownHook();
		
		
	}
}
