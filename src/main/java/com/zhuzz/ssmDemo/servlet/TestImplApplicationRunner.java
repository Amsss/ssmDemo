package com.zhuzz.ssmDemo.servlet;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author: Zezhao.Zhu
 * @Description: 一定要有@Component这个注解。要不然SpringBoot扫描不到这个类,是不会执行。
 * @Create: 2018/5/8 11:39
 * @Modified By：
 */
@Component
public class TestImplApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(args);
        System.out.println("这个是测试ApplicationRunner接口");
    }
}
