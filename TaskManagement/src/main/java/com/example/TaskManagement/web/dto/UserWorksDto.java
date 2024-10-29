package com.example.TaskManagement.web.dto;

public class UserWorksDto {

    private Long userWorksId;

    private Long employeeId;
    private Long taskId;

    public UserWorksDto(){

    }

    public UserWorksDto(Long userWorksId, Long employeeId, Long taskId) {
        this.userWorksId = userWorksId;
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
