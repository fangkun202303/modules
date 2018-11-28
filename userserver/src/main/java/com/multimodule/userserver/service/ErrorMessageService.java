package com.multimodule.userserver.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: ErrorMessageService
 * @Description: 当用户服务挂掉的时候会执行这个
 * @Author: FangKun
 * @Date: Created in 2018/11/25 16:51
 * @Version: 1.0
 */
@Service
public class ErrorMessageService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
//        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
        return null;
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
