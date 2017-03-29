package com.vonzhou.learn.section7.environment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @version 2017/3/29.
 */
public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.getEnvironment().setActiveProfiles("online");

        /**
         * 底层是使用Set存储的！如果不指定profile，则使用default
         */
//        ctx.getEnvironment().setActiveProfiles("dev", "online");
        ctx.getEnvironment().setDefaultProfiles("online");
        ctx.register(AppConfig.class, AppConfigDev.class, AppConfigOnline.class, AppConfigDefault.class);
        ctx.refresh();

        Foo foo = ctx.getBean(Foo.class);
        System.out.println(foo.getName());

        System.out.println(ctx.getEnvironment().containsProperty("username"));
    }
}
