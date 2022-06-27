package com.spring.core.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.core.model.User;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);

		Resource resource = new ClassPathResource("springconfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		User user1 = beanFactory.getBean("user1",User.class);
		System.out.println(user1);
	}
}
