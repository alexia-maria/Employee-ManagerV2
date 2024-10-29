package com.baeldung.ls.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class SpElBeanA {

    @Value("#{2+3}")
    private Integer add;

    @Value("#{'Learn' + 'Spring'}")
    private String addString;

    @Value("#{2 == 2}")
    private boolean equal;

    @Value("#{spElBeanB.prop1}")
    private String otherBeanProperty;
}
