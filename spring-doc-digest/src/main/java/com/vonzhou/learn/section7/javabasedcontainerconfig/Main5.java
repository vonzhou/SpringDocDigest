package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 7.12
 * 
 * @Configuration class-centric use of XML with @ImportResource
 * 
 * @version 2017/3/28.
 */
public class Main5 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    }
}
