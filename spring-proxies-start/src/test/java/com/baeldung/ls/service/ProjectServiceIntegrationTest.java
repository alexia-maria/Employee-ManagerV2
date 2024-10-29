package com.baeldung.ls.service;

import com.baeldung.ls.persistence.model.Project;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ProjectServiceIntegrationTest {

    @Autowired
    private IProjectService projectService;

    @Test
    public void givenNewProject_whenSaved_thenSuccess() {
        Project newProject = new Project("First Project", LocalDate.now());
        assertNotNull(projectService.save(newProject));
    }
}
