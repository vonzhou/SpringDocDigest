package com.vonzhou.learn.javadoc.configuration.v1;

import com.vonzhou.learn.javadoc.configuration.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @version 2017/5/26.
 */
@Configuration
public class AppConfig {

    @Bean
    public MyBean myBean() {
        // instantiate, configure and return bean ...
        return new MyBean();
    }
}
