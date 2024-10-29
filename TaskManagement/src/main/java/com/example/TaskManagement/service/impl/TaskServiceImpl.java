package com.example.TaskManagement.service.impl;

import com.example.TaskManagement.persistence.model.Task;
import com.example.TaskManagement.persistence.repository.TaskRepository;
import com.example.TaskManagement.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements ITaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Task save(Task task){
        return taskRepository.save(task);
    }

    @Override
    public Iterable<Task> findAll() {
        return taskRepository.findAll();
    }
}
