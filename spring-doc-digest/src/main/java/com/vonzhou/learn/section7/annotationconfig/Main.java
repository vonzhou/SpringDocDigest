package com.vonzhou.learn.section7.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vonzhou.learn.section7.containerextension.MyDataSource;

/**
 * 7.9
 *
 * 注意：<context:annotation-config/> only looks for annotations on beans in the same application context in which it is defined.
 * This means that, if you put <context:annotation-config/> in a WebApplicationContext for a DispatcherServlet,
 * it only checks for @Autowired beans in your controllers, and not your services.
 * 
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section7/context-7.9.xml"});

    }
}
