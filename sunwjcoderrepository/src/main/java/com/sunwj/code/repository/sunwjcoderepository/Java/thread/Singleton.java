package com.sunwj.code.repository.sunwjcoderepository.Java.thread;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/4 3:22 下午
 */
public class Singleton {

    private Singleton (){}

    private static boolean isInit = false;
    private static Singleton instance;

    public static Singleton getInstance() {
        if (!isInit) {//判断是否初始化过
            instance = new Singleton();//初始化
            isInit = true;//初始化标识赋值为true
        }
        return instance;
    }
}
