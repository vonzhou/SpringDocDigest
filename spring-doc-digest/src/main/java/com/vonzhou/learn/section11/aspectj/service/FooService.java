package com.vonzhou.learn.section11.aspectj.service;

import com.vonzhou.learn.section11.aspectj.Auditable;
import org.springframework.stereotype.Service;

/**
 * @version 2017/4/25.
 */
@Service
public class FooService {

    @Auditable(value = 1)
    public void addFoo() {
        System.out.println("FooService: addFoo ...");
    }
}
