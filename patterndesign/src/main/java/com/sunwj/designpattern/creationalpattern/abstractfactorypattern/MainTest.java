package com.sunwj.designpattern.creationalpattern.abstractfactorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:17 下午
 */
public class MainTest {

    public static void main(String[] args) {

        AbstractFactory phoneFactory = new PhoneFactory();
        Phone applePhone = phoneFactory.createPhone("Apple");
        Phone huaWeiPhone = phoneFactory.createPhone("HuaWei");
        System.out.println(applePhone.call());
        System.out.println(huaWeiPhone.call());

        AbstractFactory computerFactory = new ComputerFactory();
        Computer appleComputer = computerFactory.createComputer("Apple");
        Computer huaweiComputer = computerFactory.createComputer("HuaWei");
        System.out.println(appleComputer.intenmet());
        System.out.println(huaweiComputer.intenmet());
    }
}
