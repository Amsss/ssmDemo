package com.zhuzz.ssmDemo.concurrent;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/8 10:22
 * @Modified By：
 */
//@Configuration
//@ComponentScan("com.zhuzz.ssmDemo.concurrent")
//@EnableAsync // 1开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {// 2配置AsyncConfigurer并重写getAsyncExecutor

    @Override
    public Executor getAsyncExecutor() {// 2
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);

        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
