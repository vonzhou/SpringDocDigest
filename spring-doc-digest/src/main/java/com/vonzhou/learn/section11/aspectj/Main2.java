package com.vonzhou.learn.section11.aspectj;

import com.vonzhou.learn.section11.aspectj.dao.FooDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @version 2017/3/29.
 */
public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        FooDao fooDao = ctx.getBean(FooDao.class);
        fooDao.insert();
    }
}
