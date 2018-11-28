package com.multimodule.redisserver.restInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @ClassName: userRestInterface
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/27 14:22
 * @Version: 1.0
 */
@FeignClient("redisServer")
public interface RedisRestInterface {

    @RequestMapping("/getValue")
    public String gainValue(@RequestParam String key);

    @RequestMapping("/setValue")
    public String setValue(@RequestParam Map<String,Object> map);
}
