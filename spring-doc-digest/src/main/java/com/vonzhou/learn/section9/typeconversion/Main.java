package com.vonzhou.learn.section9.typeconversion;

import org.springframework.core.convert.converter.Converter;

/**
 * @version 2017/3/31.
 */
public class Main {
    public static void main(String[] args) {
        Converter<String, Status> converter = new StringToEnumConverterFactory().getConverter(Status.class);
        Status status = converter.convert("OK");
        System.out.println(status == Status.OK);
    }
}
