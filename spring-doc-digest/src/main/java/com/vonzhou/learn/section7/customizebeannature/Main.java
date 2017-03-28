package com.vonzhou.learn.section7.customizebeannature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 7.6 Customizing the nature of a bean
 *
 * 初始化和关闭回调
 *
 * Multiple lifecycle mechanisms configured for the same bean, with different initialization methods, are called as follows:
 * 1）Methods annotated with @PostConstruct
 * 2）afterPropertiesSet() as defined by the InitializingBean callback interface
 * 3）A custom configured init() method
 * 
 * Destroy methods are called in the same order:
 * 1）Methods annotated with @PreDestroy
 * 2）estroy() as defined by the DisposableBean callback interface
 * 3）A custom configured destroy() method
 *
 * 一语道破Aware的作用：Spring offers a range of Aware interfaces that allow beans to indicate to the container that 
 * they require a certain *infrastructure* dependency
 *
 *
 *
 * @version 2017/3/21.
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                        new String[] {"section7/service-context.xml"});

        /**
         * 触发 destroy 方法的执行
         */
//        context.close();

        /**
         * 或者 
         * 最佳实践：Shutting down the Spring IoC container gracefully in non-web applications
         */
        context.registerShutdownHook();

    }
}
