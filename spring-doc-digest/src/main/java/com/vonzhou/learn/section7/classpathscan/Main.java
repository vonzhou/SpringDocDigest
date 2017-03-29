package com.vonzhou.learn.section7.classpathscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 7.10
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section7/context-7.10.xml"});

    }
}
