package com.biomatiques.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biomatiques.model.Employee;
import com.biomatiques.repository.EmployeeRepository;



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