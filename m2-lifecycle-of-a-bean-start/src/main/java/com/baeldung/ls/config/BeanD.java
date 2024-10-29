package com.baeldung.ls.config;

import javax.annotation.PreDestroy;

public class BeanD {
    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy annotated method is called.");
    }
}
