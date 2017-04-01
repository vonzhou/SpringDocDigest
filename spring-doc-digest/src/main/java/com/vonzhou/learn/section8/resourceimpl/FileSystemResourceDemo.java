package com.vonzhou.learn.section8.resourceimpl;

import org.springframework.core.io.FileSystemResource;

/**
 * @version 2017/3/30.
 */
public class FileSystemResourceDemo {
    public static void main(String[] args) {
        FileSystemResource fileSystemResource = new FileSystemResource("D:\\aaaa");
        System.out.println(fileSystemResource.exists());
        System.out.println(fileSystemResource.isReadable());
    }
}
