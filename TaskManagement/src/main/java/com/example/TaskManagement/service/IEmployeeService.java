package com.example.TaskManagement.service;

import com.example.TaskManagement.persistence.model.Employee;
import org.springframework.stereotype.Service;


public interface IEmployeeService {
    Employee save(Employee employee);

    Iterable<Employee> findAll();
}
