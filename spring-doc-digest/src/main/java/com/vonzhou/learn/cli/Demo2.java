package com.vonzhou.learn.cli;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @version 2017/4/5.
 */
public class Demo2 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>(Arrays.asList("A", "B", "C"));
        Set<String> s2 = new HashSet<String>(Arrays.asList("D", "B", "E"));

        Set<String> s3 = new HashSet<String>(s1);

//        s1.retainAll(s2);
        s1.removeAll(s2);
        System.out.println(s1);

        System.out.println(s3);

        System.out.println(StringUtils.trimToEmpty(String.format("%s %s", StringUtils.trimToEmpty(null), "xxx")));



        B b = new B();
        System.out.println(b instanceof A);
    }


    public static class A{

    }


    public static class B extends A{

    }
}
