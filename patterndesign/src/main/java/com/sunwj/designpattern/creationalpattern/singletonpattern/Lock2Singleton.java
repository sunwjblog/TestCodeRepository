package com.sunwj.designpattern.creationalpattern.singletonpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:39 下午
 */
public class Lock2Singleton {

    private volatile static Lock2Singleton singleton;

    private Lock2Singleton() {}

    public static Lock2Singleton getInstance() {

        if (singleton == null) {
            synchronized (SingletonInnerClass.class) {
                if (singleton == null)
                    singleton = new Lock2Singleton();
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        String timeStr = "2021-06-11 15:45:13";
        System.out.println(timeStr.startsWith("2021-06-11"));
    }
}
