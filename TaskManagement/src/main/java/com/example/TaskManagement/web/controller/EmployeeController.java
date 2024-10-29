package com.example.TaskManagement.web.controller;

import com.example.TaskManagement.persistence.model.Employee;
import com.example.TaskManagement.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {

    private IEmployeeService employeeService;

    private ApplicationEventPublisher publisher;


    public EmployeeController(IEmployeeService employeeService, ApplicationEventPublisher publisher){
        this.employeeService = employeeService;
        this.publisher = publisher;
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return (List<Employee>) employeeService.findAll();
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
    }

}
