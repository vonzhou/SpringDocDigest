package com.vonzhou.learn.section11.aspectj.dao;

import com.vonzhou.learn.section11.aspectj.domain.Foo;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.QueryTimeoutException;
import org.springframework.stereotype.Component;

/**
 * @version 2017/4/24.
 */
@Component
public class FooDao {
    public void insert() {
        System.out.println("foo insert...");
    }

    public Foo get(int i) throws DataAccessException {
        if (i == 0)
            throw new QueryTimeoutException("fake");

        return new Foo();
    }

    public boolean update(Foo foo) {
        System.out.println("foo update ...");
        return true;
    }
}
