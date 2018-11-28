package com.multimodule.redisserver.rediscontroller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.multimodule.redisserver.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

import static com.alibaba.fastjson.JSON.*;

/**
 * @ClassName: IndexController
 * @Description: 测试缓存是否搭建起来
 * @Author: FangKun
 * @Date: Created in 2018/11/24 9:07
 * @Version: 1.0
 */
@Controller
@RequestMapping("/redis")
public class IndexController {

    @Autowired
    private RedisTemplate redisTemplate;

    public RedisUtil getRedisUtil() {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.setRedisTemplate(this.redisTemplate);
        return redisUtil;
    }

    /**
     * @param map map的数据格式为{key：key，item：item}
     * @MethodName gainValue
     * @Description 测试缓存服务是否搭建起来
     * @Return java.lang.String
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/24 9:12
     */
    @RequestMapping("/getValue")
    @ResponseBody
    public String gainValue(@RequestParam Map<String, Object> map) {
        Object o = getRedisUtil().hget((String) map.get("key"), (String) map.get("item"));
        return toJSONString(o);
    }

    /**
     * @param map
     * @MethodName setValue
     * @Description 将map的数据添加到缓存中，map的数据为{key：key，item：item，value：object}
     * @Return java.lang.String
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/27 16:04
     */
    @RequestMapping("/setValue")
    @ResponseBody
    public String setValue(@RequestParam Map<String, Object> map) {
        boolean b = getRedisUtil().hset((String) map.get("key"), (String) map.get("item"), map.get("value"));
        if (b == true) {
            return "200";
        }
        return "400";
    }

    /**
     * @param list 数据集合
     * @param key  哈希列表的key
     * @MethodName setValues
     * @Description 将一个集合中的数据到存到缓存中
     * @Return java.lang.String
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/28 9:13
     */
    @RequestMapping("/setValues")
    @ResponseBody
    public String setValues(@RequestParam List<Object> list, @RequestParam String key) {
        String code = "200";
        StringBuilder s = new StringBuilder();
        s.append("ID为");
        for (Object o : list) {
            JSONObject jo = JSON.parseObject(String.valueOf(o));
            boolean b = getRedisUtil().hset(key, (String) jo.get("ID"), jo);
            if (b != true) {
                s.append(jo.get("ID"));
            }
        }
        s.append("的数据没有保存到缓存中。");
        if (code.equals("200")) {
            return code;
        } else {
            return s.toString();
        }
    }

}
