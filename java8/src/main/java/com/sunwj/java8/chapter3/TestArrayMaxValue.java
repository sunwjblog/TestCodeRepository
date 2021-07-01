package com.sunwj.java8.chapter3;

import java.util.function.Supplier;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/7/1 10:52 下午
 */
public class TestArrayMaxValue {

    private static int maxValue (Supplier<Integer> sup) {
        return  sup.get();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,66};

        int maxNum = maxValue(() -> {

            int max = arr[0];

            for (int i : arr) {
                if (i > max)
                    max = i;
            }
            return max;
        });

        System.out.println(maxNum);
    }
}
