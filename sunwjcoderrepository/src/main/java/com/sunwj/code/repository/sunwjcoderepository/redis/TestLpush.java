package com.sunwj.code.repository.sunwjcoderepository.redis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sunwj.code.repository.sunwjcoderepository.redis.model.Person;
import com.sunwj.code.repository.sunwjcoderepository.redis.test.Person1;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2020/9/17 2:34 下午
 */
public class TestLpush {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.auth("");
        Person person1 = new Person("test","testadd",12);
        Person person2 = new Person("test","testadd",12);
        Person person3 = new Person("test","testadd",12);
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        System.out.println(JSONObject.toJSONString(list));
        jedis.set("test",JSONObject.toJSONString(list));

        String personStr = jedis.get("test");
//        jedis.del("test");
        List<Person1> personList = JSON.parseArray(personStr, Person1.class);
        System.out.println(personList.toString());
    }
}
