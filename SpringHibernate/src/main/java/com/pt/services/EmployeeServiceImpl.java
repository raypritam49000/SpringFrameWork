package com.pt.services;

import com.pt.dao.EmployeeDao;
import com.pt.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public EmployeeDao employeeDao;

    @Transactional
    public void add(Employee employee) {
        employeeDao.add(employee);
    }
}