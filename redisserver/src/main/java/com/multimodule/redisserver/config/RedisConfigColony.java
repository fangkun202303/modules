package com.multimodule.redisserver.config;

import com.multimodule.redisserver.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: RedisConfigColony
 * @Description: redis 集群的配置
 * @Author: FangKun
 * @Date: Created in 2018/11/21 14:49
 * @Version: 1.0
 */
//@Configuration
//@PropertySource("classpath:config/redis.properties")
@SuppressWarnings("all")
public class RedisConfigColony {

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
    @Value("${spring.redis.cluster.nodes}")
    private String clusterNodes;   //连接的节点

    @Value("${spring.redis.cluster.max-redirects}")
    private Integer mmaxRedirectsac;  //最大的连接的redis数目

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

    /**
     * @MethodName redisClusterConfiguration
     * @Description Redis集群的配置
     * @param  
     * @Return org.springframework.data.redis.connection.RedisClusterConfiguration
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 14:53
     */
    @Bean
    public RedisClusterConfiguration redisClusterConfiguration() {
        RedisClusterConfiguration redisClusterConfiguration = new RedisClusterConfiguration();
//        Set<RedisNode> clusterNodes
        String[] serverArray = clusterNodes.split(",");
        Set<RedisNode> nodes = new HashSet<RedisNode>();
        for (String ipPort : serverArray) {
            String[] ipAndPort = ipPort.split(":");
            nodes.add(new RedisNode(ipAndPort[0].trim(), Integer.valueOf(ipAndPort[1])));
        }
        redisClusterConfiguration.setClusterNodes(nodes);
        redisClusterConfiguration.setMaxRedirects(mmaxRedirectsac);
        return redisClusterConfiguration;
    }

    /**
     * @MethodName JedisConnectionFactory
     * @Description 配置工厂
     * @param jedisPoolConfig
     * @param redisClusterConfiguration 
     * @Return org.springframework.data.redis.connection.jedis.JedisConnectionFactory
     * @Exception
     * @Author FangKun
     * @Version V1.0.0
     * @Date 2018/11/21 14:54
     */
    @Bean
    public JedisConnectionFactory JedisConnectionFactory(JedisPoolConfig jedisPoolConfig, RedisClusterConfiguration redisClusterConfiguration) {
        JedisConnectionFactory JedisConnectionFactory = new JedisConnectionFactory(redisClusterConfiguration, jedisPoolConfig);
        return JedisConnectionFactory;
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
//        initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
        new InitRedisConfigs().initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
        return redisTemplate;

    }

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
//    private void initDomainRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
//        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
//        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//        // 开启事务
//        redisTemplate.setEnableTransactionSupport(true);
//        redisTemplate.setConnectionFactory(factory);
//    }

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
//        RedisUtil redisUtil = new RedisUtil();
//        redisUtil.setRedisTemplate(redisTemplate);
        return new InitRedisConfigs().redisUtil(redisTemplate);
    }
}
