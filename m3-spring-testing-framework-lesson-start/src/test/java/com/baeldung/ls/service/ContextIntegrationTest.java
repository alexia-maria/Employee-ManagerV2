package com.baeldung.ls.service;

import org.springframework.context.ApplicationContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContextIntegrationTest {

    // anotatia clasei face ca testul sa fie un spring enables test

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void whenContextIsLoaded_thenNoException(){

    }

    @Test
    public void whenContextIsLoaded_thenNoException2(){

    }


}
