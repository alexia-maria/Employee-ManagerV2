package com.example.TaskManagement.web.dto;

import jakarta.persistence.Column;
import org.hibernate.annotations.NaturalId;

import java.util.UUID;

public class TaskDto {
    private Long taskId;

    private String uuid = UUID.randomUUID().toString();

    private String name;
    private String priority;
    private String description;

    public TaskDto(){

    }

    public TaskDto(Long taskId, String uuid, String name, String priority, String description) {
        this.taskId = taskId;
        this.uuid = uuid;
        this.name = name;
        this.priority = priority;
        this.description = description;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
