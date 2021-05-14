package com.sunwj.code.repository.sunwjcoderepository.redis.connect;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Description:连接Redis多节点集群服务加载ShardedJedisSentinelPool
 * </p>
 *
 * @author TANHAIHAN
 * @version 1.0
 * @date 2019年11月19日
 */
public class RedisClusterConnection {

    private static RedisClusterConnection instance;

    private JedisCluster jedisCluster;

    private RedisClusterConnection() {
        try {
            int maxTotal = PropertiesUtil.getInt(RedisConstants.MAX_TOTAL, GenericObjectPoolConfig.DEFAULT_MAX_TOTAL);
            int maxIdle = PropertiesUtil.getInt(RedisConstants.MAX_IDLE, GenericObjectPoolConfig.DEFAULT_MAX_IDLE);
            int numTestsPerEvictionRun = PropertiesUtil.getInt(RedisConstants.NUM_TESTS_PER_EVICTION_RUN, 1024);
            int timeBetweenEvictionRunsMillis = PropertiesUtil.getInt(RedisConstants.TIME_BETWEEN_EVICTION_RUNS_MILLIS, 30000);
            int minEvictableIdleTimeMillis = PropertiesUtil.getInt(RedisConstants.MIN_EVICTABLE_IDLE_TIME_MILLIS, 100000);
            int softMinEvictableIdleTimeMillis = PropertiesUtil.getInt(RedisConstants.SOFT_MIN_EVICTABLE_IDLE_TIME_MILLIS, 10000);
            int maxWaitMillis = PropertiesUtil.getInt(RedisConstants.MAX_WAIT_MILLIS, 1500);
            boolean testOnBorrow = PropertiesUtil.getBoolean(RedisConstants.TEST_ON_BORROW, false);
            boolean testWhileIdle = PropertiesUtil.getBoolean(RedisConstants.TEST_WHILE_IDLE, true);
            boolean blockWhenExhausted = PropertiesUtil.getBoolean(RedisConstants.BLOCK_WHEN_EXHAUSTED, false);
            JedisPoolConfig poolConfig = new JedisPoolConfig();
            poolConfig.setMaxTotal(maxTotal);
            poolConfig.setMaxIdle(maxIdle);
            poolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
            poolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
            poolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
            poolConfig.setSoftMinEvictableIdleTimeMillis(softMinEvictableIdleTimeMillis);
            poolConfig.setMaxWaitMillis(maxWaitMillis);
            poolConfig.setTestOnBorrow(testOnBorrow);
            poolConfig.setTestWhileIdle(testWhileIdle);
            poolConfig.setBlockWhenExhausted(blockWhenExhausted);
            String nodes = PropertiesUtil.getString(RedisConstants.CLUSTER_NODES);
            String[] arrNode = nodes.split(",");
            Set<HostAndPort> jedisClusterNode = new HashSet<HostAndPort>();
            for (String node : arrNode) {
                String[] addr = node.split(":");
                String host = addr[0];
                String port = addr[1];
                HostAndPort hp = new HostAndPort(host, Integer.parseInt(port));
                jedisClusterNode.add(hp);
            }
            int connectionTimeout = PropertiesUtil.getInt(RedisConstants.REDIS_TIMEOUT, 8000);
            int soTimeout = PropertiesUtil.getInt(RedisConstants.REDIS_SOTIMEOUT, 5000);
            int maxAttempts = PropertiesUtil.getInt(RedisConstants.REDIS_ATTEMPTS, 3);
            String password = PropertiesUtil.getString(RedisConstants.REDIS_PASSWORD, "");
            if (StringUtils.isBlank(password)) {
                jedisCluster = new JedisCluster(jedisClusterNode, connectionTimeout, soTimeout, maxAttempts, poolConfig);
            } else {
                jedisCluster = new JedisCluster(jedisClusterNode, connectionTimeout, soTimeout, maxAttempts, password, poolConfig);
            }
        } catch (Exception e) {
            System.err.println("jedisCluster load error ... " + e.getMessage());
        }
    }

    public static synchronized RedisClusterConnection getInstance() {
        if (instance == null) {
            instance = new RedisClusterConnection();
        }
        return instance;
    }

    /**
     * @return
     * @description 获取Redis多节点集群服务连接池
     */
    public JedisCluster getJedisCluster() {
        return jedisCluster;
    }
}
