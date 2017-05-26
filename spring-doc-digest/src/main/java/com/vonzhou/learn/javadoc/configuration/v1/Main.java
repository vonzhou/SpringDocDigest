package com.vonzhou.learn.javadoc.configuration.v1;

import com.vonzhou.learn.javadoc.configuration.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 2017/5/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        MyBean myBean = ctx.getBean(MyBean.class);
        myBean.func();
        // use myBean ...
    }
}
