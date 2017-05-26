package com.vonzhou.learn.config;

import com.vonzhou.learn.interceptor.LogInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @EnableWebMvc注解，才会执行下面的addInterceptors
 * 为何执行两次？？
 * 但是 LogInterceptor 并未执行！
 * @version 2017/5/26.
 */
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public LogInterceptor logInterceptor() {
        return new LogInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new HandlerInterceptorAdapter() {
//            @Override
//            public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
//                            throws Exception {
//                super.afterCompletion(request, response, handler, ex);
//            }
//
//            @Override
//            public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler)
//                            throws Exception {
//                super.afterConcurrentHandlingStarted(request, response, handler);
//            }
//
//            @Override
//            public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
//                            ModelAndView modelAndView) throws Exception {
//                System.out.println("===== post handler ====");
//            }
//
//            @Override
//            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//                            throws Exception {
//                System.out.println("===== pre handler =====");
//                return true;
//            }
//        });
        System.out.println("===== add interceptors =====");
        registry.addInterceptor(logInterceptor());
    }
}
