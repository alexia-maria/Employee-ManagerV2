package com.example.TaskManagement.web.controller;

import com.example.TaskManagement.persistence.model.Task;
import com.example.TaskManagement.service.IEmployeeService;
import com.example.TaskManagement.service.ITaskService;
import com.example.TaskManagement.web.dto.TaskDto;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {

    private ITaskService taskService;
    private ApplicationEventPublisher publisher;

    public TaskController(ITaskService taskService, ApplicationEventPublisher publisher){
        this.taskService = taskService;
        this.publisher = publisher;
    }


    @GetMapping
    public List<Task> getTasks(){
        return (List<Task>) taskService.findAll();
    }

    @PostMapping
    void addTask(@RequestBody Task task){
        taskService.save(task);
    }

    //    @GetMapping
//    public String getTasks(Model model){
//
//        Iterable<Task> tasks = taskService.findAll();
//
//        List<TaskDto> taskDtos = new ArrayList<>();
//        tasks.forEach(t-> taskDtos.add(convertTaskToDto(t)));
//
//        model.addAttribute("tasks", taskDtos);
//
//        return "tasks";
//    }



    protected TaskDto convertTaskToDto(Task entity){
        TaskDto dto = new TaskDto(entity.getTaskId(), entity.getUuid(), entity.getName(), entity.getDescription(), entity.getPriority());
        return dto;
    }

    protected Task convertTaskToEntity(TaskDto dto){

        Task task = new Task(dto.getUuid(), dto.getName(), dto.getDescription(), dto.getPriority());

        if(dto.getTaskId() != null){
            task.setTaskId(dto.getTaskId());
        }
        return task;
    }

}
