package com.example.ls.service.impl;

import com.example.ls.persistence.repository.IProjectRepository;
import com.example.ls.service.IProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements IProjectService {

    private IProjectRepository projectRepository;

    public ProjectServiceImpl(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    
}
