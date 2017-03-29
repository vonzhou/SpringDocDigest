package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @version 2017/3/29.
 */
@Configuration
@Import(ConfigA.class)
public class ConfigB {

    @Bean
    public Bar bar() {
        return new Bar();
    }
}
