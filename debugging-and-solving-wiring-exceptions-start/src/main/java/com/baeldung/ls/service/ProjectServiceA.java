package com.baeldung.ls.service;

import org.springframework.stereotype.Service;

@Service
public class ProjectServiceA {
    private ProjectServiceB projectServiceB;

    public ProjectServiceA(ProjectServiceB projectServiceB) {
        this.projectServiceB = projectServiceB;
    }
}
