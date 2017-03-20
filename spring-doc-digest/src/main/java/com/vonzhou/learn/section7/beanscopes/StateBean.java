package com.vonzhou.learn.section7.beanscopes;

/**
 * @version 2017/3/20.
 */
public class StateBean {
    public void init() {
        System.out.println("StateBean init ....");
    }

    public void doAction() {
        System.out.println("StateBean working ...");
    }

    public void shutdown() {
        System.out.println("StateBean shutdown ....");
    }
}
