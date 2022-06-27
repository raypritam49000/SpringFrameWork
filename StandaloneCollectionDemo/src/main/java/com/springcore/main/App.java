package com.springcore.main;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.model.Person;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Person person = (Person) context.getBean("person");
		List<String> list = person.getFriends();

		System.out.println(list.getClass().getName());

		for (String s : list) {
			System.out.println(s);
		}

		Map<String, Integer> fees = person.getFees();
		System.out.println(fees.getClass().getName());

		Set set = fees.entrySet();
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Entry m = (Map.Entry) it.next();
			System.out.println(m.getKey() + " " + m.getValue());
		}

		Properties properties = person.getSalary();
		System.out.println(properties);
		
	}
}
