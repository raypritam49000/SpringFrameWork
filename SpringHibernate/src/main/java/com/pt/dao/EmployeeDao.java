
package com.pt.dao;

import com.pt.entities.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao {

	public abstract void add(Employee employee);

}