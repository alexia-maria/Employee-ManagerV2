package com.example.TaskManagement.persistence.model;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

import java.util.Objects;
import java.util.UUID;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @NaturalId
    @Column(unique = true, nullable = false, updatable = false)
    private String uuid = UUID.randomUUID().toString();

    private String name;
    private String priority;
    private String description;

    public Task(){

    }

    public Task( String name, String priority, String description) {
        this.name = name;
        this.priority = priority;
        this.description = description;
    }

    public Task(String uuid, String name, String priority, String description) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return getUuid().equals(task.getUuid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid());
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
