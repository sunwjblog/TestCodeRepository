package com.sunwj.designpattern.creationalpattern.factorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 9:52 下午
 */
public class MainTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone applePhone = factory.createPhonr("Apple");
        Phone huaWeiPhone = factory.createPhonr("HuaWei");
        applePhone.brand();
        huaWeiPhone.brand();
    }
}
