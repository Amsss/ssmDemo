package com.zhuzz.ssmDemo.listener;

import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/**
 * @Author: Zezhao.Zhu
 * @Description: 实现ServletContextListener，覆盖其两个方法
 * @Create: 2018/5/7 18:26
 * @Modified By：
 */
@Configuration
@WebListener
public class CustomListener implements ServletContextListener{

    @Override
    public void contextDestroyed(ServletContextEvent servletContext) {
        System.out.println("servletContext销毁......");

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContext) {
        System.out.println("servletContext初始化......");
    }

}
