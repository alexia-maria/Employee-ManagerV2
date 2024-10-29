package com.baeldung.ls.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceB {

    private ProjectServiceA projectServiceA;

    public ProjectServiceB(@Lazy ProjectServiceA projectServiceA) {
        this.projectServiceA = projectServiceA;
    }

    // A depinde de B si B depinde A => Spring arunca o exceptie

    // Solutie 1: restructurarea codului

    // Solutie 2: setarea proprietatii spring.main.allow-circular-references to true

    // Solutie 3: facem unul din beans Lazy - va fi initializat doar cand avem nevoie de el, pana atunci Spring va folosi un proxy
}
