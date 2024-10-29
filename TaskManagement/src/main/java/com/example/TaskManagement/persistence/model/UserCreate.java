package com.example.TaskManagement.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class UserCreate {

    @Id
    @GeneratedValue
    private Long userCreateId;
    private Long employeeId;
    private Long taskId;


    public UserCreate(){

    }

    public UserCreate( Long employeeId, Long taskId) {
        this.employeeId = employeeId;
        this.taskId = taskId;
    }

    public Long getUserCreateId() {
        return userCreateId;
    }

    public void setUserCreateId(Long userCreateId) {
        this.userCreateId = userCreateId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}
