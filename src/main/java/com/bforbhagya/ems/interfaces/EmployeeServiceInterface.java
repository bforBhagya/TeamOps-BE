package com.bforbhagya.ems.interfaces;

import com.bforbhagya.ems.employee.EmployeeDetails;
import com.bforbhagya.ems.model.Employee;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployees();


    Employee createEmployee(Employee employee);

    ResponseEntity<Employee> getEmployeeById(Long id);

    ResponseEntity<Employee> updateEmployee(Long id, EmployeeDetails employeeDetails);
}
