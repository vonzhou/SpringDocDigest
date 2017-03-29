package com.vonzhou.learn.section7.environment;

import org.springframework.core.env.PropertySource;

/**
 * @version 2017/3/29.
 */
public class MyPropertySource extends PropertySource {

    public MyPropertySource(String name) {
        super(name);
    }

    public Object getProperty(String name) {
        return null;
    }
}
