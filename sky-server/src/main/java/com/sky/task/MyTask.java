package com.sky.task;
/*
 * @author  MaRui
 * @date  2023/8/3 15:01
 * @version 1.0
 */


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author MaRui
 */
@Component
@Slf4j
public class MyTask {

//    @Scheduled(cron = "0/5 * * * * ?")
    public void executeTask(){
        log.info(String.valueOf(new Date()));
    }
}
