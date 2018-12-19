package com.multimodule.userserver.config;

import com.multimodule.userserver.domain.SysApp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope // 标注在类上面就是将类中被@Value注释的成员变量进行刷新
public class UserConfig  {

    @Value("${from}")
    private String fromValue;

    @Bean
    @RefreshScope // 将这个方法刷新，如果被@Bean注释，需要联合使用
    public SysApp getMap(){
        SysApp app=new SysApp();
        app.setAppname(fromValue);
        return app;
    }

    //@LoadBalanced//在注册中心里进行查找微服务,负载均衡
    @Bean
    public RestTemplate restTemplate(){
        RestTemplate restTemplate=new RestTemplate();
        return  restTemplate;
    }

}
