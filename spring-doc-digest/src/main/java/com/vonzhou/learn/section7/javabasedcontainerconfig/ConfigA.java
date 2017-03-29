package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 2017/3/29.
 */
@Configuration
public class ConfigA {

    @Bean(initMethod = "init")
    public Foo foo() {
        return new Foo();
    }
}
