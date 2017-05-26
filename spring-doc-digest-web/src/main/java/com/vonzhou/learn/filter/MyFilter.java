package com.vonzhou.learn.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/** filter 是Servlet层面的，需要在 web.xml 中进行配置
 * @version 2017/5/26.
 */
@Component
public class MyFilter extends GenericFilterBean {
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
                    throws IOException, ServletException {
        System.out.println("xxxxx");

    }
}
