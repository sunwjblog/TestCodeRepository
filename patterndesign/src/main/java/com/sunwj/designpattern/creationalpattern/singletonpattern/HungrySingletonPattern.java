package com.sunwj.designpattern.creationalpattern.singletonpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:36 下午
 */
public class HungrySingletonPattern {

    private static HungrySingletonPattern hungrySingletonPattern = new HungrySingletonPattern();

    private HungrySingletonPattern() {}

    public static HungrySingletonPattern getInstance() {
        return hungrySingletonPattern;
    }
}
