package com.baeldung.ls.service.impl;

import com.baeldung.ls.LsApp;
import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.persistence.repository.IProjectRepository;
import com.baeldung.ls.service.IProjectService;
import jakarta.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceResourceImpl implements IProjectService {

    private IProjectRepository projectRepository;

    private static final Logger LOG = LoggerFactory.getLogger(LsApp.class);

//    @Resource
    @Resource(name = "projectRepositoryImpl")
    public void setProjectRepository(IProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
        LOG.info("wired projectRepository instance: {}", projectRepository);
    }

    // in cazul in care interfata pe care vrem sa o injectam are mai multe implementari, putem specifica ce implementare dorim
    // cu atributul name

    @Override
    public Optional<Project> findById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }

}
