package com.vonzhou.learn.section7.dependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入：构造器；setter方法
 *
 * 循环依赖：BeanCurrentlyInCreationException
 *
 * 理解依赖解析（Dependency resolution）的过程
 *
 * 注入集合类型的依赖
 *
 * lazy-init：真正需要的时候再创建bean，而不是eagerly create and configure all singleton beans in the initialization process
 *
 * 自动装配：byType, byName
 *
 * 方法注入
 * 
 * 
 * @version 2017/3/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section7/service-context.xml"});

        Bar bar = (Bar) context.getBean("bar2");
        System.out.println(bar);

        OuterPerson op = (OuterPerson) context.getBean("outer");
        System.out.println(op.getTarget());

        ExpensiveToCreateBean expensiveToCreateBean = (ExpensiveToCreateBean) context.getBean("lazy");

        CommandManager cmdManager = (CommandManager) context.getBean("cmdManager", CommandManager.class);
        cmdManager.process(1);
        cmdManager.process(2);

        CommandManager2 cmdManager2 = (CommandManager2) context.getBean("cmdManager2", CommandManager2.class);
        cmdManager2.process();
        cmdManager2.process();

    }
}
