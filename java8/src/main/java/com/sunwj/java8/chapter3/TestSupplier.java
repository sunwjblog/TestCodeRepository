package com.sunwj.java8.chapter3;

import java.util.function.Supplier;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/7/1 10:46 下午
 */
public class TestSupplier {

    private static String getString(Supplier<String> function) {
        return function.get();
    }

    public static void main(String[] args) {

        String test1 = getString(() -> "胡歌");
        System.out.println(test1);
    }
}
