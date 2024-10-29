package com.example.ls.service;

import com.example.ls.persistence.model.Project;
import com.example.ls.persistence.model.Task;

import java.util.List;
import java.util.Optional;

public interface ITaskService {

    Optional<Project> findBYId(Long id);

    Project save(Project project);

    Iterable<Project> findAll();

    Project addTasks(Project project, List<Task> tasks);
}
