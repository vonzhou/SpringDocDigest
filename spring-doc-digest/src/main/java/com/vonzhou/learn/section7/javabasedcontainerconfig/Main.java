package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 7.12
 *
 * All @Configuration classes are subclassed at startup-time with CGLIB
 * 
 *
 * @version 2017/3/28.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = ctx.getBean(MyService.class);
        myService = ctx.getBean(MyService.class);
        myService.doStuff();
    }
}
