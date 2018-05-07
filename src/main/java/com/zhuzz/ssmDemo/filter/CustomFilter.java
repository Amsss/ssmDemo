package com.zhuzz.ssmDemo.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * @Author: Zezhao.Zhu
 * @Description: 实现javax.servlet.Filter,覆盖其三个方法
 * @Create: 2018/5/7 18:11
 * @Modified By：
 */
@Configuration
@WebFilter(filterName="customFilter",urlPatterns="/*")
@Order(value = 1)
public class CustomFilter implements Filter{

    @Override
    public void destroy() {
        System.out.println("CustomFilter过滤器销毁");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("CustomFilter指定过滤器操作......");
        //执行操作后必须doFilter
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("CustomFilter初始化......");
    }
}
