package com.bforbhagya.ems.service;

import com.bforbhagya.ems.employee.EmployeeDetails;
import com.bforbhagya.ems.exception.ResourceNotFoundException;
import com.bforbhagya.ems.repository.EmployeeRepository;
import com.bforbhagya.ems.interfaces.EmployeeServiceInterface;
import com.bforbhagya.ems.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public ResponseEntity<Employee> getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(("Employee Not Exist with id :" + id)));
        return ResponseEntity.ok(employee);
    }

    @Override
    public ResponseEntity<Employee> updateEmployee(Long id, EmployeeDetails employeeDetails) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Exist with id :" + id));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmail(employeeDetails.getEmail());
        Employee updatedEmployee = employeeRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }


}
