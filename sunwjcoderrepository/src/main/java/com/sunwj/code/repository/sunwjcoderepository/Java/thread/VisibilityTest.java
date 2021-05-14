package com.sunwj.code.repository.sunwjcoderepository.Java.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/4 3:09 下午
 */
public class VisibilityTest {

    public static volatile int count = 0;

    public static void main(String[] args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");

        //读取count值的线程
        new Thread(() -> {
            System.out.println("开始读取count...");
            int i = count;//存放count的更新前的值
            while (count < 3) {
                if (count != i) {//当count的值发生改变时，打印count被更新
                    System.out.println(sdf.format(new Date()) + " count被更新为" + count);
                    i = count;//存放count的更新前的值
                }
            }
        }).start();

        //更新count值的线程
        new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                //每隔1秒为count赋值一次新的值
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(sdf.format(new Date()) + " 赋值count为" + i);
                count = i;

            }
        }).start();
    }
}
