package com.example.TaskManagement.persistence.repository;

import com.example.TaskManagement.persistence.model.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Long>, CrudRepository<Task, Long>{
}
