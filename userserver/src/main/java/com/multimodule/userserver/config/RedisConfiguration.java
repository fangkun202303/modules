package com.multimodule.userserver.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: redisConfiguration
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/13 16:19
 * @Version: 1.0
 */
//@Configuration
public class RedisConfiguration {

    //使用Feign自己的注解，使用springmvc的注解就会报错
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
