package com.baeldung.persistence.repository.impl;

import com.baeldung.persistence.model.Project;

import java.util.Optional;

public interface IProjectRepository {

    Optional<Project> findById(Long id);

    public Project save(Project project);


}
