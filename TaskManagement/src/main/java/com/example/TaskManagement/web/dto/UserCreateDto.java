package com.example.TaskManagement.web.dto;

public class UserCreateDto {

    private Long userCreateId;
    private Long employeeId;
    private Long taskId;

    public UserCreateDto(){

    }

    public UserCreateDto(Long userCreateId, Long employeeId, Long taskId) {
        this.userCreateId = userCreateId;
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
