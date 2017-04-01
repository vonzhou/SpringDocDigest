package com.vonzhou.learn.section8.resourceimpl;

import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;

/**
 * 8.3.1 UrlResource
 * @version 2017/3/30.
 */
public class UrlResourceDemo {
    public static void main(String[] args) throws MalformedURLException {
        UrlResource urlResource = new UrlResource("http://www.baidu.com");
        System.out.println(urlResource.exists());
        System.out.println(urlResource.getDescription());
    }
}
