package com.vonzhou.learn.section7.dependencies;

/**
 * @version 2017/3/20.
 */
public class Command {
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void execute() {
        System.out.println(String.format("Command(%s-%s) execute...", this, state));
    }
}
