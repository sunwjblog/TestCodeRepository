package com.sunwj.designpattern.structuralpattern.proxypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/15 10:16 下午
 */
public class HR implements Company{
    @Override
    public void findWorker(String title) {
        System.out.println("i need a worker. title : " + title);
    }
}
