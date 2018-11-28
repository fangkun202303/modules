package com.multimodule.redisserver.config;

import com.multimodule.redisserver.utils.RedisUtil;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @ClassName: InitRedisConfigs
 * @Description: TODO
 * @Author: FangKun
 * @Date: Created in 2018/11/21 15:00
 * @Version: 1.0
 */
public class InitRedisConfigs {

    /**
     * @MethodName initDomainRedisTemplate
     * @Description 设置数据存入 redis 的序列化方式,并开启事务
     * @param redisTemplate
     * @param factory
     * @Return void
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 14:57
     */
    public void initDomainRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        // 开启事务
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.setConnectionFactory(factory);
    }

    /**
     * @param redisTemplate
     * @MethodName redisUtil
     * @Description 注入封装RedisTemplate
     * @Return com.mybatisplus.utils.RedisUtil
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 14:39
     */
    public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.setRedisTemplate(redisTemplate);
        return redisUtil;
    }
}
