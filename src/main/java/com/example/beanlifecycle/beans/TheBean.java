package com.example.beanlifecycle.beans;

import org.springframework.stereotype.Component;

@Component
public class TheBean {

    public void beanMethod() {
        System.out.println("I do Work");
    }

}
