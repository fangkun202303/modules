package com.multimodule.redisserver.config;

import com.multimodule.redisserver.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: RedisConfigSentry
 * @Description: Redis的哨兵模式
 * @Author: FangKun
 * @Date: Created in 2018/11/21 15:06
 * @Version: 1.0
 */
//@Configuration
//@PropertySource("classpath:config/redis.properties")
@SuppressWarnings("all")
public class RedisConfigSentry {

    @Value("${redis.hostName}")
    public String hostName;

    @Value("${redis.port}")
    public Integer port;

    @Value("${redis.maxIdle}")
    private Integer maxIdle; //最大空闲数

    @Value("${redis.maxTotal}")
    private Integer maxTotal; //redis连接池pool可分配的jedis实例

    @Value("${redis.maxWaitMillis}")
    private Integer maxWaitMillis; //最大建立连接等待时间

    @Value("${redis.minEvictableIdleTimeMillis}")
    private Integer minEvictableIdleTimeMillis; //连接的最小空闲时间

    @Value("${redis.numTestsPerEvictionRun}")
    private Integer numTestsPerEvictionRun; //每次释放连接的最大数目

    @Value("${redis.timeBetweenEvictionRunsMillis}")
    private long timeBetweenEvictionRunsMillis; //逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1

    @Value("${redis.testOnBorrow}")
    private boolean testOnBorrow; //是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个

    @Value("${redis.testWhileIdle}")
    private boolean testWhileIdle; //在空闲时检查有效性, 默认false

    //哨兵1
    @Value("${redis.sentinel.host1}")
    private String senHost1;
    @Value("${redis.sentinel.port1}")
    private Integer senPort1;
    //还有其他哨兵，再配置

    /**
     * @param
     * @MethodName jedisPoolConfig
     * @Description 配置redis的连接池
     * @Return redis.clients.jedis.JedisPoolConfig
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 14:36
     */
    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        // 最大空闲数
        jedisPoolConfig.setMaxIdle(maxIdle);
        // 连接池的最大数据库连接数
        jedisPoolConfig.setMaxTotal(maxTotal);
        //最大建立连接等待时间
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        //逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
        jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        //每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
        jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
        //逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        //是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个
        jedisPoolConfig.setTestOnBorrow(testOnBorrow);
        //在空闲时检查有效性, 默认false
        jedisPoolConfig.setTestWhileIdle(testWhileIdle);
        return jedisPoolConfig;
    }

    @Bean
    public RedisSentinelConfiguration sentinelConfiguration(){
        RedisSentinelConfiguration redisSentinelConfiguration = new RedisSentinelConfiguration();
        //配置matser的名称
         RedisNode redisNode = new RedisNode(hostName, port);
         redisNode.setName("mymaster");
         redisSentinelConfiguration.master(redisNode);
        // 配置redis的哨兵sentinel
         RedisNode senRedisNode = new RedisNode(senHost1,senPort1);
         Set<RedisNode> redisNodeSet = new HashSet<>();
         redisNodeSet.add(senRedisNode);
         redisSentinelConfiguration.setSentinels(redisNodeSet);
         return redisSentinelConfiguration;
         }

    /**
     * @MethodName redisUtil
     * @Description 注入封装RedisTemplate
     * @Return com.mybatisplus.utils.RedisUtil
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 14:39
     */
    @Bean(name = "redisUtil")
    public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
        return new InitRedisConfigs().redisUtil(redisTemplate);
    }

    /**
     * @MethodName functionDomainRedisTemplate
     * @Description 实例化RedisTemplate对象
     * @param redisConnectionFactory
     * @Return org.springframework.data.redis.core.RedisTemplate<java.lang.String,java.lang.Object>
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 14:56
     */
    @Bean
    public RedisTemplate<String, Object> functionDomainRedisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        new InitRedisConfigs().initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
//        initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
        return redisTemplate;
    }
}
