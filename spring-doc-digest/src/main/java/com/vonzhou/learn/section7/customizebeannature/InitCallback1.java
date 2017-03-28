package com.vonzhou.learn.section7.customizebeannature;

import org.springframework.beans.factory.InitializingBean;

/**
 * 方式1： 实现接口InitializingBean
 * @version 2017/3/21.
 */
public class InitCallback1 implements InitializingBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitCallback1 init ...");
    }
}
