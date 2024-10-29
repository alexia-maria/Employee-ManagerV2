package com.baeldung.ls.web.controller;

import com.baeldung.ls.persistence.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value="/projects") // base path
public class ProjectController {

    @GetMapping("/1")
    public Project findone(){
        return new Project("testName", LocalDate.now());
    }
}
