package com.vonzhou.learn.section7.classpathscan;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @version 2017/3/28.
 */
@Service
public class FooService {

    @PostConstruct
    public void init() {
        System.out.println("Foo Service ... ");
    }
}
