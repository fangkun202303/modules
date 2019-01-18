package com.multimodule.userserver.config;

import com.multimodule.userserver.domain.SysUser;
import com.multimodule.userserver.restInterface.RedisRestInterface;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: FeignClientFallback
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/12/20 9:25
 * @Version: 1.0
 */
@Component
public class FeignClientFallback implements RedisRestInterface {

    private final String message="缓存服务出问题了！";

    @Override
    public String gainValue(Map<String, Object> map) {
        return message;
    }

    @Override
    public String setValue(Map<String, Object> map) {
        return message;
    }

    @Override
    public String setValues(List<SysUser> list, String key) {
        return message;
    }
}
