package com.example.TaskManagement.web.dto;

import com.example.TaskManagement.persistence.model.UserRole;
import jakarta.persistence.Column;
import org.hibernate.annotations.NaturalId;

import java.util.UUID;

public class EmployeeDto {

    private Long employeeId;
    private String taskUuid = UUID.randomUUID().toString();

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private UserRole userRole;

    public EmployeeDto(){

    }

    public EmployeeDto(Long employeeId, String taskUuid, String firstName, String lastName, String email, String password, UserRole userRole) {
        this.employeeId = employeeId;
        this.taskUuid = taskUuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getTaskUuid() {
        return taskUuid;
    }

    public void setTaskUuid(String taskUuid) {
        this.taskUuid = taskUuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
