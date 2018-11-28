package com.multimodule.redisserver.config;

import com.multimodule.redisserver.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @ClassName: RedisConfig
 * @Description: 单机版的redis整合
 * @Author: FangKun
 * @Date: Created in 2018/11/21 14:20
 * @Version: 1.0
 */
//@Configuration
//@PropertySource("classpath:config/redis.properties")
@SuppressWarnings("all")
public class RedisConfig {

    private static final Logger lg = LoggerFactory.getLogger(RedisConfiguration.class);

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

    //redis集群的配置
//    @Value("${spring.redis.cluster.nodes}")
//    private String clusterNodes;

//    @Value("${spring.redis.cluster.max-redirects}")
//    private Integer mmaxRedirectsac;

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
        lg.info("加载redis的配置！");
        return jedisPoolConfig;
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
        lg.info("实例化RedisTemplate对象创建成功！");
        return redisTemplate;
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
    @Bean(name = "redisUtil")
    public RedisUtil redisUtil(RedisTemplate<String, Object> redisTemplate) {
        lg.info("redis的模版类加载加载完成！");
        return new InitRedisConfigs().redisUtil(redisTemplate);
    }

    /**
     * 单机版配置
     *
     * @param @param  jedisPoolConfig
     * @param @return
     * @return JedisConnectionFactory
     * @throws
     * @Title: JedisConnectionFactory
     * @autor lpl
     * @date 2018年2月24日
     */
    @Bean
    public JedisConnectionFactory JedisConnectionFactory(JedisPoolConfig jedisPoolConfig) {
        JedisConnectionFactory JedisConnectionFactory = new JedisConnectionFactory(jedisPoolConfig);
        //连接池
        JedisConnectionFactory.setPoolConfig(jedisPoolConfig);
        // IP地址
        JedisConnectionFactory.setHostName(hostName);
        //端口号
        JedisConnectionFactory.setPort(port);
        // 如果Redis设置有密码
        //JedisConnectionFactory.setPassword(password);
        // 客户端超时时间单位是毫秒
        JedisConnectionFactory.setTimeout(5000);
        lg.info("JedisConnectionFactory 创建成功！");
        return JedisConnectionFactory;
    }


}
