package com.service.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
   
    @Autowired
    private EmployeeRepository employeeRepository;
   
    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }
   
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}