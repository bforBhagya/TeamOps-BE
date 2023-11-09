package com.bforbhagya.ems.interfaces;

import com.bforbhagya.ems.model.Employee;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployees();

    String createEmployee();
}
