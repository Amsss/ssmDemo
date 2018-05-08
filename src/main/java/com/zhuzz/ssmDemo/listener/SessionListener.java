package com.zhuzz.ssmDemo.listener;

import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * @Author: Zezhao.Zhu
 * @Description: 实现HttpSessionListener接口，监视session的动态
 * @Create: 2018/5/7 18:27
 * @Modified By：
 */
@WebListener
public class SessionListener implements HttpSessionListener{

    @Override
    public void sessionCreated(HttpSessionEvent session) {
        System.out.println("session创建成功......");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent session) {
        System.out.println("session销毁......");
    }
}
