package com.sunwj.java8.chapter3;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/29 9:35 下午
 */
public class Lambda_3_2 {


    public static void main(String[] args) {

        Runnable r1 = () -> System.out.println("Hello world 1");

        Runnable r2 =  new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world 2");
            }
        };

        process(r1);
        process(r2);
        process(() -> System.out.println("Hello world 3"));
    }

    public static void process(Runnable r) {
        r.run();
    }

}
