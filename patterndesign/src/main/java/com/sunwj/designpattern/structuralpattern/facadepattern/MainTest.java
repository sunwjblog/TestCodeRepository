package com.sunwj.designpattern.structuralpattern.facadepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/15 10:54 下午
 */
public class MainTest {

    public static void main(String[] args) {
        Starter starter = new Starter();
        System.out.println("....startup..");
        starter.startup();
        System.out.println("....shutdown..");
        starter.shutdown();

    }
}
