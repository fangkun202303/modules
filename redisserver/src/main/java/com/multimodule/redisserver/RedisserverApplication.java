package com.multimodule.redisserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class RedisserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisserverApplication.class, args);
    }
}
