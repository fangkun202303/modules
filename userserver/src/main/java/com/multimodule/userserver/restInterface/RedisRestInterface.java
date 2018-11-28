package com.multimodule.userserver.restInterface;

import com.multimodule.userserver.domain.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
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

    @RequestMapping("/redis/getValue")
    public String gainValue(@RequestParam Map<String, Object> map);

    @RequestMapping("/redis/setValue")
    public String setValue(@RequestParam Map<String, Object> map);

    @RequestMapping("/redis/setValues")
    public String setValues(@RequestParam List<SysUser> list, @RequestParam String key);
}
