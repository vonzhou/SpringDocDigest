package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 7.12
 * 
 * Import 其他配置类
 *
 * @version 2017/3/28.
 */
public class Main4 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
        Foo foo = ctx.getBean(Foo.class);
        Bar bar = ctx.getBean(Bar.class);
    }
}
