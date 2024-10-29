package com.example.TaskManagement.persistence.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserWorks {

    @Id
    @GeneratedValue
    private Long userWorksId;

    private Long employeeId;
    private Long taskId;

    public UserWorks(){

    }
    public UserWorks(Long employeeId, Long taskId) {
        this.employeeId = employeeId;
        this.taskId = taskId;
    }

    public Long getUserWorksId() {
        return userWorksId;
    }

    public void setUserWorksId(Long userWorksId) {
        this.userWorksId = userWorksId;
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
