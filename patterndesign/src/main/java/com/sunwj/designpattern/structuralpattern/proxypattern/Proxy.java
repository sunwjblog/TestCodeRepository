package com.sunwj.designpattern.structuralpattern.proxypattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/15 10:17 下午
 */
public class Proxy implements Company{

    private HR hr;

    public Proxy() {
        this.hr = new HR();
    }

    @Override
    public void findWorker(String title) {
        hr.findWorker(title);
        String worker = this.getWorker(title);
        System.out.println("find a worker by proxy, worker name is : " + worker);
    }

    private String getWorker(String title) {

        Map<String,String> workerList = new HashMap<String,String>(){};
        workerList.put("Java","张三");
        workerList.put("Python","李四");
        workerList.put("Php","王五");

        return workerList.get(title);
    }
}
