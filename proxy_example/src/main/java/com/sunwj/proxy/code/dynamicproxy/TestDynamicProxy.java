package com.sunwj.proxy.code.dynamicproxy;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/27 11:01 下午
 */
public class TestDynamicProxy {

    public static void main(String[] args) {
        ExpressDeliveryService expressDeliveryService =
                (ExpressDeliveryService) JdkProxyFactory.getProxy(new ExpressDeliveryServiceImpl());
        expressDeliveryService.send("广州");
    }
}
