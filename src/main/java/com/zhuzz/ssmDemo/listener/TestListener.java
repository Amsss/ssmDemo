package com.zhuzz.ssmDemo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/7 18:02
 * @Modified By：
 */
public class TestListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("listener destroy");
    }

    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("listener init");
    }

}
