package com.baeldung.ls.config;

import javax.annotation.PostConstruct;

public class BeanA {

    @PostConstruct
    public void post(){
        System.out.println("Post Construct");
    }
    //metoda va fi apelata doar o data, dupa ce beanul a fost initializat
}
