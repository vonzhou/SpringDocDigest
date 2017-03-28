package com.vonzhou.learn.section7.containerextension;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 3.26
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"section7/context-2.xml"});

        MyDataSource dataSource = (MyDataSource)context.getBean("dataSource");
        System.out.println(dataSource);
    }
}
