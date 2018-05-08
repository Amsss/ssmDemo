package com.zhuzz.ssmDemo.concurrent;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/8 10:21
 * @Modified By：
 */
@Service
public class AsyncTaskService {

    @Async //1标识是是异步方法
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务: "+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务:+1: "+(i+1));
    }

}
