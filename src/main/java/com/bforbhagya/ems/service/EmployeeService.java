package com.bforbhagya.ems.service;

import com.bforbhagya.ems.Repository.EmployeeRepository;
import com.bforbhagya.ems.interfaces.EmployeeServiceInterface;
import com.bforbhagya.ems.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public String createEmployee() {
        return null;
    }
}
