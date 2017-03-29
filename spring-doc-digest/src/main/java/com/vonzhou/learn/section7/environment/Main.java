package com.vonzhou.learn.section7.environment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 7.13
 *
 * 如果不激活某个profile就会出现NoSuchBeanDefinitionException
 *
 *
 *
 * @version 2017/3/29.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section7/context-7.13.xml"});
        Foo foo = context.getBean(Foo.class);
        System.out.println(foo.getName());
    }
}
