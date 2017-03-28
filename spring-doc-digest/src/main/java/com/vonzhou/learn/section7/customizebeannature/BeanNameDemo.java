package com.vonzhou.learn.section7.customizebeannature;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @version 2017/3/21.
 */
@Component
public class BeanNameDemo implements BeanNameAware {
    private String name;

    public void setBeanName(String name) {
        this.name = name;
    }
}
