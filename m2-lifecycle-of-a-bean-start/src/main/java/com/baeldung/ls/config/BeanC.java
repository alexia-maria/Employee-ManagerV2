package com.baeldung.ls.config;


;

import javax.annotation.PreDestroy;
public class BeanC {


    public void destroy() {
        System.out.println("Custom destroy method is called.");
    }
}
