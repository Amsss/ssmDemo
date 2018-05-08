package com.zhuzz.ssmDemo.services.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/**
 * @Author: Zezhao.Zhu
 * @Description: 定时服务
 * @Create: 2018/5/8 9:53
 * @Modified By：
 */
@Service
public class ScheduledTaskService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000) // 1@Scheduled:声明该方法是一个计划任务，fixedRate属性设置每隔固定时间执行
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次： " + dateFormat.format(new Date()));
    }

    @Scheduled(cron = "1 * * * * ?") // 2cron属性：按照指定时间执行(11时28)cron事unix和类unix(linux)系统下的定时时间
    public void fixTimeExecution() {
        System.out.println("在指定时间内执行一次： " + dateFormat.format(new Date()) + "执行");
    }

}
