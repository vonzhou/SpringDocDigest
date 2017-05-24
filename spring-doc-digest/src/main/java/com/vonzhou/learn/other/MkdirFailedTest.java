package com.vonzhou.learn.other;

import java.io.File;

/**
 * 无法创建目录，也不会抛异常
 * 可以利用File.mkdir()的返回值
 * @version 2017/5/23.
 */
public class MkdirFailedTest {
    public static void main(String[] args) {
        String path = "F:\\tmp\\abc";
        File file = new File(path);
        Boolean maked = file.mkdirs();
        System.out.println(maked);
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }
}
