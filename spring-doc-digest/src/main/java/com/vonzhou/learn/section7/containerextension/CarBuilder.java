package com.vonzhou.learn.section7.containerextension;

/**
 * @version 2017/3/28.
 */
public class CarBuilder {
    private String make;
    private int year;

    private static CarBuilder cb = new CarBuilder();

    public static CarBuilder car() {
        return cb;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Car factory() {
        // 做一些很复杂的操作，生成一个car
        Car car = new Car();
        car.setMake(this.make);
        return car;
    }
}
