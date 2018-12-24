package com.example.demo.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class Schedule {
    Logger logger = LoggerFactory.getLogger(Schedule.class);
//    Logger logger = LoggerFactory.getLogger(getClass());
    @Scheduled(cron = "0/10 * * * * *")
    public void timer1(){
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.info("当前时间:-10秒执行一次:"+localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
    @Scheduled(cron = "0/2 * * * * *")
    public void timer2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.info("当前时间: -两秒执行一次:"+localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
    }
}
