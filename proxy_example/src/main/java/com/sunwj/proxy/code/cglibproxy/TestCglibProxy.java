package com.sunwj.proxy.code.cglibproxy;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/27 11:16 下午
 */
public class TestCglibProxy {

    public static void main(String[] args) {
        ExpressDelivery expressDelivery =
                (ExpressDelivery) CglibProxyFactory.getProxy(ExpressDelivery.class);
        expressDelivery.send("官洲");
    }
}
