package com.biomatiques.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.biomatiques.model.Employee;
import com.biomatiques.service.EmployeeService;

@RestController
public class EmployeeController {
   
    @Autowired
    EmployeeService employeeService;
   
    @RequestMapping(method = RequestMethod.GET, value = "/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
      
    @RequestMapping(value="/employee",headers="Accept=application/json",method=RequestMethod.POST)
    public void addEmployee( @RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }
   
}