package com.vonzhou.learn.section7.customizebeannature;

import org.springframework.context.Lifecycle;

/**
 * 不要使用！
 * @version 2017/3/21.
 */
public class LifeCycleDemo implements Lifecycle {
    public void start() {
        System.out.println("LifeCycleDemo start ...");
    }

    public void stop() {
        System.out.println("LifeCycleDemo stop ...");
    }

    public boolean isRunning() {
        /**
         * 检查依赖的状态
         */
        return true;
    }
}
