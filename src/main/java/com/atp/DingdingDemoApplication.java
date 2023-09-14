package com.atp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableScheduling
public class DingdingDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DingdingDemoApplication.class, args);
    }

//    @Scheduled(cron = "*/1 * * * * ?")
    public void testSchedule(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println("schedule, time:" + formatter.format(now));
    }

}
