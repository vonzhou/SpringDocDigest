package com.vonzhou.learn.section7.customizebeannature;

import javax.annotation.PreDestroy;

/**
 * @version 2017/3/21.
 */
public class DestroyCallback3 {

    @PreDestroy
    public void destroy() {
        System.out.println("DestroyCallback2 destroy ...");
    }
}
