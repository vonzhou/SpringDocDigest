package com.vonzhou.learn.section7.containerextension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by vonzhou on 2017/3/26.
 */
public class InstantiationTracingBeanPostProcessor implements BeanPostProcessor {

    // 直接返回正在初始化的bean
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean; // 可以在这里返回任何对象
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean '" + beanName + "' created : " + bean.toString());
        return bean;
    }
}
