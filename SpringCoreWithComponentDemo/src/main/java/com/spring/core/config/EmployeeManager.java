package com.spring.core.config;

import com.spring.core.model.Address;
import com.spring.core.model.Employee;

public interface EmployeeManager {
  public abstract Employee create();
  public abstract Address add();
}
