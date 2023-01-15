package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.beans.ApplicationBeans;
import com.springcore.beans.Person;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationBeans.class);
        Person person =  context.getBean("person",Person.class);
        System.out.println(person.getName()+" "+person.getAge()+" "+person.getMobile()+" "+person.getCity());
        
    }
}
