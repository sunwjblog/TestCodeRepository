package com.sunwj.code.repository.sunwjcoderepository.Java.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/18 12:55 下午
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<String,String> testMap = new HashMap<>();
        testMap.put("1","11");
        testMap.put("2","22");
        testMap.put("3","33");
        testMap.put("4","44");
        testMap.put("5","55");
        testMap.put("6","66");

        System.out.println("未删除前: " + testMap);

        List<String> deleteList = new ArrayList<>();
        deleteList.add("1");
        deleteList.add("2");
        deleteList.add("3");

        testMap.keySet().removeAll(deleteList);
        System.out.println("删除后: " + testMap);
        System.out.println("删除后的大小： " + testMap.size());


    }
}
