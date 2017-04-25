package com.vonzhou.learn.section11.aspectj;

import org.springframework.context.annotation.*;

/**
 * @version 2017/3/29.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.vonzhou.learn.section11.aspectj.*")
public class AppConfig {

}
