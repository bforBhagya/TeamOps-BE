package com.bforbhagya.ems.controller;

import com.bforbhagya.ems.employee.EmployeeDetails;
import com.bforbhagya.ems.interfaces.EmployeeServiceInterface;
import com.bforbhagya.ems.model.Employee;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(HttpServletRequest request) {
        System.out.println("Received GET request with headers: " + request.getHeaderNames());
        return employeeServiceInterface.getAllEmployees();
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee, HttpServletRequest request) {
        System.out.println("Received POST request with headers: " + request.getHeaderNames());
        return employeeServiceInterface.createEmployee(employee);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id, HttpServletRequest request) {
        return employeeServiceInterface.getEmployeeById(id);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody EmployeeDetails employeeDetails) {
        return employeeServiceInterface.updateEmployee(id, employeeDetails);
    }

}
