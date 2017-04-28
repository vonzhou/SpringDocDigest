package com.vonzhou.learn.section17.declarative;

/**
 * @version 2017/4/28.
 */
public interface FooService {

    Foo getFoo(String fooName);

    Foo getFoo(String fooName, String barName);

    void insertFoo(Foo foo);

    void updateFoo(Foo foo);

}
