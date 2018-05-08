package com.zhuzz.ssmDemo;

import com.zhuzz.ssmDemo.filter.TestFilter;
import com.zhuzz.ssmDemo.listener.TestListener;
import com.zhuzz.ssmDemo.servlet.TestServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//开启计划任务的支持
@EnableScheduling
@ServletComponentScan
public class SsmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmDemoApplication.class, args);
    }

    /*@Bean
    public ServletRegistrationBean testServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new TestServlet());
        registration.addUrlMappings("/hello");
        return registration;
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new TestFilter());
        registration.addUrlPatterns("/");
        return registration;
    }

    @Bean
    public ServletListenerRegistrationBean<TestListener> testListenerRegistration(){
        ServletListenerRegistrationBean<TestListener> registration = new ServletListenerRegistrationBean<TestListener>(new TestListener());
        return registration;
    }*/
}
