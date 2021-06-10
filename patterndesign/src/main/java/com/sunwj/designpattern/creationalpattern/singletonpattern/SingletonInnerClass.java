package com.sunwj.designpattern.creationalpattern.singletonpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:37 下午
 */
public class SingletonInnerClass {

    private static class SingletonHolder {
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    private SingletonInnerClass() {}

    public static SingletonInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
