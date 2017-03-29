package com.vonzhou.learn.section7.classpathscan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 需要配置：
 * <bean class="com.vonzhou.learn.section7.classpathscan.AppConfig"/>
 * <context:annotation-config/>
 * 
 * 或者直接使用：
 * <context:component-scan base-package="com.vonzhou.learn.section7.classpathscan"/>
 *
 * 注意
 *
 *
 * @version 2017/3/28.
 */
@Configuration
@ComponentScan(basePackages = "com.vonzhou.learn.section7.classpathscan")
public class AppConfig {
}
