package com.spring.core.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.core.config.EmployeeManager;
import com.spring.core.config.EmployeeManagerImp;
import com.spring.core.config.SpringConfiguration;
import com.spring.core.model.Employee;

public class App {
	public static void main(String[] args) {
		// Ist Way
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		EmployeeManagerImp employeeManagerImp = (EmployeeManagerImp) applicationContext.getBean(EmployeeManagerImp.class);
		System.out.println(employeeManagerImp.create());
		System.out.println(employeeManagerImp.create().getAddress());
		
		System.out.println("--------------------------------------------------------------");
		// 2nd Way
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SpringConfiguration.class);
        ctx.refresh();
         
        EmployeeManager empManager = ctx.getBean(EmployeeManagerImp.class);
        Employee emp = empManager.create();
         
        System.out.println(emp);
        System.out.println(emp.getAddress());
       
	}
}
