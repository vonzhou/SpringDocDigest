package com.vonzhou.learn.interceptor;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html#mvc-handlermapping-interceptor
 * Created by vonzhou on 16/7/22.
 */
public class LogInterceptor extends HandlerInterceptorAdapter {

    //  Intercept the execution of a handler.
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        if(!isValidUser()){
            System.out.println("Invalid user from " + request.getRemoteAddr());
            response.sendRedirect("/user/error");
            return false;
        }

        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        System.out.println("Will call " + handler.toString());


        response.getWriter().println(" --- From Interceptor, you are rejected.");
        response.flushBuffer();

        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("before return view  page, i can get model = " + modelAndView.getModelMap().get("hello"));
    }

    // Callback after completion of request processing, that is, after rendering the view.
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Our Log Func
        long curTime = System.currentTimeMillis();
        long startTime = (Long)request.getAttribute("startTime");
        long cost = curTime - startTime;
        System.out.println("Call cost time " + cost + " mills!");
    }

    // FAKE
    private boolean isValidUser(){
        return true;
    }
}