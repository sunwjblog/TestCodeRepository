package com.sunwj.code.repository.sunwjcoderepository.redis.connect;

/**
 * <p>
 * Description: Redis配置文件配置元素属性常量类
 * </p>
 *
 * @author TANHAIHAN
 * @version 1.0
 * @date 2019年11月19日
 */
public class RedisConstants {

    // 默认字符编码：UTF-8
    public static final String DEFAULT_ENCODING = "UTF-8";
    // 一秒的毫秒数：1000
    public static final long THOUSAND_MILLSECONDS = 1000;


    // 连接池最大连接数
    public static final String MAX_TOTAL = "redis.pool.maxTotal";
    // 连接池中最大空闲连接数
    public static final String MAX_IDLE = "redis.pool.maxIdle";
    // 每次释放连接的最大数目###
    public static final String NUM_TESTS_PER_EVICTION_RUN = "redis.pool.numTestsPerEvictionRun";
    // 释放连接的扫描间隔(单位:毫秒)
    public static final String TIME_BETWEEN_EVICTION_RUNS_MILLIS = "redis.pool.timeBetweenEvictionRunsMillis";
    // 连接最小空闲时间(单位:毫秒)
    public static final String MIN_EVICTABLE_IDLE_TIME_MILLIS = "redis.pool.minEvictableIdleTimeMillis";
    // 连接空闲多久后释放,当空闲时间大于该值并且空闲连接大于最大空闲连接时直接释放连接
    public static final String SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS = "redis.pool.softMinEvictableIdleTimeMillis";
    // 获取连接时最大等待毫秒数,如果该值小于0,则阻塞不确定的时长,默认值-1
    public static final String MAX_WAIT_MILLIS = "redis.pool.maxWaitMillis";
    // 在获取连接时检查连接有效性,默认为false
    public static final String TEST_ON_BORROW = "redis.pool.testOnBorrow";
    // 在连接空闲时检查连接有效性,默认为false
    public static final String TEST_WHILE_IDLE = "redis.pool.testWhileIdle";
    // 连接耗尽是否阻塞,false代表抛异常,true代表阻塞直到超时,默认为true
    public static final String BLOCK_WHEN_EXHAUSTED = "redis.pool.blockWhenExhausted";

    // 设置连接超时时间
    public static final String REDIS_TIMEOUT = "redis.timeout";
    // 设置网络通信超时时间
    public static final String REDIS_SOTIMEOUT = "redis.soTimeout";
    // 设置最大重试次数
    public static final String REDIS_ATTEMPTS = "redis.attempts";
    // 设置集群访问密码
    public static final String REDIS_PASSWORD = "redis.password";
    // 连接池多节点集群服务器地址
    public static final String CLUSTER_NODES = "redis.pool.cluster.nodes";

}