package com.zhuzz.ssmDemo.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @Author: Zezhao.Zhu
 * @Description: 继承WebMvcConfigurerAdapter，复写addInterceptors方法
 * @Create: 2018/5/7 18:31
 * @Modified By：
 */
@Configuration
public class WebAdapter extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //众多的拦截器组成了一个拦截器链
        /**
         * 主要方法说明：
         * addPathPatterns 用于添加拦截规则
         * excludePathPatterns 用户排除拦截
         */
        registry.addInterceptor(new CustomInterceptor()).addPathPatterns("/*");
        registry.addInterceptor(new CustomInterceptor2()).addPathPatterns("/*");
        super.addInterceptors(registry);
    }
}
