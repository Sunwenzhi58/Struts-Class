package com.bjpowernode.web;


import javax.servlet.*;
import java.io.IOException;
import java.util.logging.LogRecord;

//自定义过滤器
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter执行了,doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
