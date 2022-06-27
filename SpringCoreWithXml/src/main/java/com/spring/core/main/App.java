package com.spring.core.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.spring.core.model.Employee;

public class App {
	public static void main(String[] args) {
		// 1 way
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee employee = (Employee) applicationContext.getBean("emp");
		System.out.println(employee);
		System.out.println(employee.getAddress());
		System.out.println("-------------------------------------------------------------");
		// 2nd way
		Resource resource = new ClassPathResource("springconfig.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee employee2 = (Employee) beanFactory.getBean("emp");
		System.out.println(employee2);
		System.out.println(employee2.getAddress());
	}
}
