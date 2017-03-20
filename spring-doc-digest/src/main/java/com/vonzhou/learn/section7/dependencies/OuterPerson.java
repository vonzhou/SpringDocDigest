package com.vonzhou.learn.section7.dependencies;

/**
 * @version 2017/3/20.
 */
public class OuterPerson {
    private Person target;

    public OuterPerson() {
        System.out.println("OuterPerson ...");
    }

    public Person getTarget() {
        return target;
    }

    public void setTarget(Person target) {
        this.target = target;
    }
}
