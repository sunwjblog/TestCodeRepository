package com.sunwj.code.repository.sunwjcoderepository.Java.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/4 4:42 下午
 */
public class WaitNotify {

    static boolean flag = true;
    static Object lock = new Object();

    public static void main(String[] args) throws Exception {

        new Thread(() -> { // 加锁 拥有lock的Monitor
            synchronized (lock) {
                // 当条件不满足时 继续wait 同时释放了lock的锁
                while (flag) {
                    try {
                        System.out.println(Thread.currentThread() + "flag is true.wait @ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                        lock.wait();
                    } catch (InterruptedException e) {

                    }
                }
                // 条件满足时 完成工作
                System.out.println(Thread.currentThread() + "flag is false.running @ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            }},"WaitThread").start();

        TimeUnit.SECONDS.sleep(1);
        new Thread(() -> { // 加锁 拥有lock的monitor
            synchronized (lock) {
                // 获取lock的锁，然后进行通知，通知时不会释放lock的锁
                // 直到当前线程释放了lock后，waitThread才能从wait方法中返回
                System.out.println(Thread.currentThread() + " hold lock .notify @ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                lock.notifyAll();
                flag = false;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {

                }

                synchronized (lock) {
                    System.out.println(Thread.currentThread() + " hold lock again.sleep @ " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {

                    }
                }
            }
            },"NotifyThread").start();

    }
}
