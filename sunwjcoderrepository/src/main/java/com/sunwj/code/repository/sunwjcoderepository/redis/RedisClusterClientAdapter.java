package com.sunwj.code.repository.sunwjcoderepository.redis;


import com.sunwj.code.repository.sunwjcoderepository.redis.connect.RedisClusterConnection;
import redis.clients.jedis.JedisCluster;

/**
 * <p>Description: Redis多节点集群连接操作工具类</p>
 *
 * @author TANHAIHAN
 * @version 1.0
 * @date 2019年11月17日
 */
public class RedisClusterClientAdapter {

    protected static JedisCluster jedisCluster;

    static {
        RedisClusterConnection connect = RedisClusterConnection.getInstance();
        jedisCluster = connect.getJedisCluster();
    }

}
