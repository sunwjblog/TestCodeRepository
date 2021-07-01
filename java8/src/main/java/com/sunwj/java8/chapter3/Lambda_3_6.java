package com.sunwj.java8.chapter3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/7/1 9:54 下午
 */
public class Lambda_3_6 {

    private static Comparator<String> newComparator() {

        // 匿名内部类
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        // Lambda表达式
        // return (a, b) -> b.length() - a.length();
    }

    public static void main(String[] args) {
        String[] array = {"abc", "ab", "abcd"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, newComparator());
        System.out.println(Arrays.toString(array));
    }
}
