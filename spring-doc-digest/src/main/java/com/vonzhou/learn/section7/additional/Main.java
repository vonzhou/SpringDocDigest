package com.vonzhou.learn.section7.additional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 7.15
 *
 * 如果resource bundle使用到了中文，需要使用工具native2ascii，比如 native2ascii.exe exceptions_zh_CN.properties
 * 
 * @version 2017/3/29.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("section7/context-7.15.xml");
        String message = context.getMessage("message", null, "Default", null);
        System.out.println(message);

        Example example = context.getBean(Example.class);
        example.execute();



        EmailService emailService = context.getBean(EmailService.class);
        emailService.setBlackList(Arrays.asList("addr1"));
        emailService.sendEmail("addr1", "msggggg");

    }
}
