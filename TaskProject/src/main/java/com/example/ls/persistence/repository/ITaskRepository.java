package com.example.ls.persistence.repository;

import com.example.ls.persistence.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITaskRepository extends CrudRepository<Task, Long> {
}
