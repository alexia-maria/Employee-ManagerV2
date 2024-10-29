package com.example.TaskManagement.service.impl;

import com.example.TaskManagement.persistence.model.Employee;
import com.example.TaskManagement.persistence.repository.EmployeeRepository;
import com.example.TaskManagement.service.IEmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements IEmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
