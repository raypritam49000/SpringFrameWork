package com.pt.dao;

import com.pt.entities.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void add(Employee employee) {
		sessionFactory.openSession().save(employee);
	}
}