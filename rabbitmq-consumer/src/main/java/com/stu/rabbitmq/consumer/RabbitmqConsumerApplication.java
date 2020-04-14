package com.stu.rabbitmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * by:https://blog.csdn.net/qq_35387940/article/details/100514134
 */
@SpringBootApplication
public class RabbitmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqConsumerApplication.class, args);
        System.out.println("RabbitmqConsumerApplication  start!!!");
    }

}
