package com.sunwj.designpattern.structuralpattern.proxypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/15 10:18 下午
 */
public class MainTest {

    public static void main(String[] args) {
        Company proxy = new Proxy();
        proxy.findWorker("Java");
    }
}
