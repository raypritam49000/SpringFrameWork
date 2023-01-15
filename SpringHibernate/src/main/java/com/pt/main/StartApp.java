package com.pt.main;

import com.pt.configs.AppConfig;
import com.pt.entities.Employee;
import com.pt.services.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartApp {

    public static void main(String[] args) {
        System.out.println("This is the start of the PT Spring Hibernate application");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        EmployeeService employeeService = context.getBean(EmployeeService.class);

        // Add Employee
        employeeService.add(new Employee(1,"Omi", "Verma", "omiverma123@gmail.com"));
        employeeService.add(new Employee(2,"Pritam","Ray","pray49000@gmail.com"));

        context.close();
    }
}