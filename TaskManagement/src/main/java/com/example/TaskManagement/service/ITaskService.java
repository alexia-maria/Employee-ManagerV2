package com.example.TaskManagement.service;

import com.example.TaskManagement.persistence.model.Task;
import org.springframework.stereotype.Service;


public interface ITaskService {
    Task save(Task task);

    Iterable<Task> findAll();
}
