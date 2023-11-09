package com.bforbhagya.ems.controller;

import com.bforbhagya.ems.interfaces.EmployeeServiceInterface;
import com.bforbhagya.ems.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @PostMapping
    public String createEmployee(){
        return employeeServiceInterface.createEmployee();
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeServiceInterface.getAllEmployees();
    }
}
