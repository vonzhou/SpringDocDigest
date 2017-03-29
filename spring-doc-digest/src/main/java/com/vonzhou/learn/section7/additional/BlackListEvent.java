package com.vonzhou.learn.section7.additional;

import org.springframework.context.ApplicationEvent;

/**
 * @version 2017/3/29.
 */
public class BlackListEvent extends ApplicationEvent {
    private final String address;
    private final String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
    }

}
