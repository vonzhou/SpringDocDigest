package com.vonzhou.learn.section7.containerextension;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 7.8
 * 
 * 使用FactoryBean自定义实例化逻辑： https://spring.io/blog/2011/08/09/what-s-a-factorybean
 *
 *
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section7/context-7.8.xml"});

        MyDataSource dataSource = (MyDataSource) context.getBean("dataSource");
        System.out.println(dataSource);
    }
}
