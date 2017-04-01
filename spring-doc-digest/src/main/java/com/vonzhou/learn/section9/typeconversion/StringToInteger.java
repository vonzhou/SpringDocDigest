package com.vonzhou.learn.section9.typeconversion;

import org.springframework.core.convert.converter.Converter;

/**
 * @version 2017/3/31.
 */
final class StringToInteger implements Converter<String, Integer> {

    public Integer convert(String source) {
        return Integer.valueOf(source);
    }


    public static void main(String[] args) {
        System.out.println(new StringToInteger().convert("324"));
    }

}
