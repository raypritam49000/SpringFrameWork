package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.model.User;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
      User user = applicationContext.getBean("user",User.class);
      System.out.println(user);
      System.out.println(user.getAddress());
    }
}
