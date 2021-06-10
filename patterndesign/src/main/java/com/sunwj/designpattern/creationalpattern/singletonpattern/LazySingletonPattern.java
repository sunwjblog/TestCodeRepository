package com.sunwj.designpattern.creationalpattern.singletonpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:34 下午
 */
public class LazySingletonPattern {

    private static LazySingletonPattern singletonPattern = null;

    private LazySingletonPattern(){}

    public static synchronized LazySingletonPattern getInstance() {
        if (singletonPattern == null)
            singletonPattern = new LazySingletonPattern();

        return singletonPattern;
    }
}
