package com.vonzhou.learn.section7.dependencies;

import java.util.Random;

/**
 * @version 2017/3/20.
 */
public class AsyncCommand {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void execute() {
        System.out.println(String.format("AsyncCommand(%s-%s) execute...", this, state));
    }

    public AsyncCommand createCommand() {
        /**
         * 本身该bean的scope是prototype，每次获取都是不同的实例
         */
        this.setState(new Random().nextInt(3));
        return this;
    }
}
