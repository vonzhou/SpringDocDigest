package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @version 2017/3/28.
 */
@Component
public class FooComponent {

    @PostConstruct
    public void init() {
        System.out.println("FooComponent init ....");
    }
}
