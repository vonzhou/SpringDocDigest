package com.vonzhou.learn.section7.environment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @version 2017/3/29.
 */
@Configuration
@Profile("dev")
public class AppConfigDev {


    @Bean
    public Foo foo(){
        return new Foo("dev");
    }

}
