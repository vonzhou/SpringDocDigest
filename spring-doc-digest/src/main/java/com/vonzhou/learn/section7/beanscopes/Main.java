package com.vonzhou.learn.section7.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vonzhou.learn.section7.beanoverview.Dog;
import com.vonzhou.learn.section7.beanoverview.DogService;
import com.vonzhou.learn.section7.beanoverview.Foo;

/**
 * in the case of prototypes, configured destruction lifecycle callbacks are not called 可以使用 bean 的 post-processor（看7.8节）
 * 
 * In some respects, the Spring container’s role in regard to a prototype-scoped bean is a replacement for the Java new operator. 
 * All lifecycle management past that point must be handled by the client
 *
 * 如果一个单例依赖prototype的bean，不要使用注入的方式（注入的那一刻bean就唯一注定了），而应该考虑使用方法注入动态获取新bean
 * 
 * 自定义scope的方法
 * 
 * @version 2017/3/20.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"section7/service-context.xml"});
        StateBean sb = (StateBean) context.getBean("stateBean");
        sb.doAction();
    }
}
