package com.spring.core.config;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spring.core.model.Address;
import com.spring.core.model.Employee;

//@Service
@Component
public class EmployeeManagerImp implements EmployeeManager {

	public Address add() {
		Address address = new Address();
		address.setCity("Ropar");
		address.setStreet("Galaxy Hotel");
		address.setState("Punjab");
		address.setCountry("India");
		return address;
	}

	public Employee create() {
		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("Pritam Ray");
		employee.setSalary(50000.0);
		employee.setEmail("pray123@gmail.com");
		employee.setAddress(add());
		return employee;

	}

}
