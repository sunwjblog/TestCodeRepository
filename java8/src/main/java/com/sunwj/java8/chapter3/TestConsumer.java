package com.sunwj.java8.chapter3;

import java.util.function.Consumer;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/7/1 11:01 下午
 */
public class TestConsumer {

    private static void consumerString(String name,Consumer<String> function) {
        function.accept(name);
    }

    public static void main(String[] args) {

        consumerString("hello",
                // 对传递的字符串进行消费 直接输出
                (String name) -> System.out.println(name) );

        // 消费方式为反转
        consumerString("hello", (String name) -> {
            String retName = new StringBuilder(name).reverse().toString();
            System.out.println(retName);
        });
    }
}
