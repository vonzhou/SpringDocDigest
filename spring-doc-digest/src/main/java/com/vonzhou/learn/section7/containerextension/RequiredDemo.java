package com.vonzhou.learn.section7.containerextension;

import org.springframework.beans.factory.annotation.Required;

/**
 * @see org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor 了解原理
 * 需要配置 context:component-scan, 然后需要的属性没有注入的话会抛出异常:
 * BeanInitializationException: Property 'name' is required for bean 'requiredDemo'
 * <p>
 * Created by vonzhou on 2017/3/26.
 */
public class RequiredDemo {
    private String name;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RequiredDemo{" +
                "name='" + name + '\'' +
                '}';
    }
}
