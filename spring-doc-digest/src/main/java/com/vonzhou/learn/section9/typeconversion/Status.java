package com.vonzhou.learn.section9.typeconversion;

/**
 * @version 2017/3/31.
 */
public enum Status {
    OK("ok", "okkkk"),
    ERROR("error", "errorrrr");

    String code;
    String desc;

    Status(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
