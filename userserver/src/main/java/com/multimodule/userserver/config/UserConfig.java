package com.multimodule.userserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: UserConfig
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/26 16:59
 * @Version: 1.0
 */
@Configuration
public class UserConfig  {

    //@LoadBalanced//在注册中心里进行查找微服务,负载均衡
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate=new RestTemplate();
        return  restTemplate;
    }
}
