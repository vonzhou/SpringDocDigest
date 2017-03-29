package com.vonzhou.learn.section7.javabasedcontainerconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

/**
 * @version 2017/3/28.
 */
@Configuration
@ImportResource("classpath:section7/properties-config.xml")
public class AppConfig {

    /**
     * 问题：设置的是系统用户名，而不是配置文件中的 ？？
     */
    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    @Bean
    @Scope("prototype")
    public MyService myService() {
        System.out.println("myService() ....");
        return new MyService();
    }

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public MyDataSource myDataSource() {
        return new MyDataSource(username, password);
    }

}
