package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 7.12
 *
 *
 * 
 *
 * @version 2017/3/28.
 */
public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("com.vonzhou.learn.section7.javabasedcontainerconfig");

        /**
         * AnnotationConfigApplicationContext@4c98385c has not been refreshed yet
         */
        ctx.refresh();
        MyService myService = ctx.getBean(MyService.class);
        myService = ctx.getBean(MyService.class);
        myService.doStuff();

        /**
         * 否则 destruction callback 也不会执行
         */
        ctx.registerShutdownHook();
    }
}
