/**
 * Globe Fintech Innovations Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package com.task.scheduler.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 
 * @author ronelle.feranil
 * @version $Id: TaskSchedulerApplication.java, v 0.1 20 Nov 2018 3:41:28 PM ronelle.feranil Exp $
 */
@SpringBootApplication
@EnableScheduling
@Configuration
public class TaskSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskSchedulerApplication.class, args);
    }
}
