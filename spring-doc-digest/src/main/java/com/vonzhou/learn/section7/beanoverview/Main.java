package com.vonzhou.learn.section7.beanoverview;

import com.vonzhou.learn.section7.dependencies.Bar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanDefinition 抽象了在元数据中bean的定义
 * 
 * 通过name属性为bean指定别名
 *
 * 实例化bean的方式：构造器；静态工厂方法；实例工厂方法；
 *
 *
 * 
 * 
 * 
 * @version 2017/3/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section7/service-context.xml"});
        Dog dog = (Dog) context.getBean("dog2");
        System.out.println(dog.getName());

        DogService dogService = (DogService) context.getBean("dogService");

        Foo foo = (Foo) context.getBean("foo");



    }
}
