package com.vonzhou.learn.section7.customizebeannature;

import org.springframework.beans.factory.DisposableBean;

/**
 * @version 2017/3/21.
 */
public class DestroyCallback1 implements DisposableBean {
    public void destroy() throws Exception {
        System.out.println("DestroyCallback1 destroy ...");
    }
}
