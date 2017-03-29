package com.vonzhou.learn.section7.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @version 2017/3/29.
 */
@Configuration
@PropertySource("classpath:section7/db.properties")
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean
    @Profile("online")
    public Bar bar() {
        /**
         * 获取配置的时候，会首先检查 system properties or environment variables，如果没有再查询指定的配置文件
         */
        System.out.println(environment.getProperty("username"));
        return new Bar();
    }

    @Bean
    @Profile("dev")
    public Bar barDev() {
        return new Bar();
    }
}
