package com.vonzhou.learn.section17.declarative;

/**
 * @version 2017/4/28.
 */
public class DefaultFooService implements FooService {

    /**
     * in the context of a transaction with read-only semantics
     * @param fooName
     * @return
     */
    public Foo getFoo(String fooName) {
        throw new UnsupportedOperationException();
    }

    public Foo getFoo(String fooName, String barName) {
        throw new UnsupportedOperationException();
    }

    /**
     *  in the context of a transaction with read-write semantics
     * @param foo
     */
    public void insertFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

    public void updateFoo(Foo foo) {
        throw new UnsupportedOperationException();
    }

}
