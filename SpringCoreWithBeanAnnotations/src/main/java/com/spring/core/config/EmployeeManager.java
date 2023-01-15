package com.spring.core.config;

import com.spring.core.model.Address;
import com.spring.core.model.Employee;

public interface EmployeeManager {
  public Employee create();
  public Address add();
}
