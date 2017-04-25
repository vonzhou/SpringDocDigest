package com.vonzhou.learn.section11.aspectj;

import com.vonzhou.learn.section11.aspectj.dao.FooDao;
import com.vonzhou.learn.section11.aspectj.service.FooService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 11.2
 *
 *
 * @version 2017/3/29.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section11/context-aspectj.xml"});
        FooDao fooDao = context.getBean(FooDao.class);
        fooDao.insert();
        System.out.println("----------------");
        try {
            fooDao.get(0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("-----------------");
        FooService fooService = context.getBean(FooService.class);
        fooService.addFoo();
    }
}
