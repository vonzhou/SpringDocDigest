package com.vonzhou.learn.section7.dependencies;

/**
 * @version 2017/3/17.
 */
public class CircularB {
    private CircularA a;

    public CircularB(CircularA a) {
        this.a = a;
    }
}
