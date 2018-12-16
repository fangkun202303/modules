package com.multimodule.userserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.multimodule.userserver.restInterface")
@EnableTransactionManagement
public class UserserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserserverApplication.class, args);
    }
}
