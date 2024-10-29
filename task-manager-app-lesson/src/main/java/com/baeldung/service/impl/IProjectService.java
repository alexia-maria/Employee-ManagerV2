package com.baeldung.service.impl;

import com.baeldung.persistence.model.Project;

import java.util.Optional;

public interface IProjectService {
    Optional<Project> findById(Long id);

    public Project save(Project project);
}
