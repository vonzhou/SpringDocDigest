package com.vonzhou.learn.section7.customizebeannature;

import javax.annotation.PostConstruct;

/**
 * 方式3：使用注解PostConstruct，别忘了配置context:component-scan
 * 
 * @version 2017/3/21.
 */
public class InitCallback3 {

    public void init() {
        System.out.println("InitCallback3 default init ...");
    }

    @PostConstruct
    public void init2() {
        System.out.println("InitCallback3 init ...");
    }
}
