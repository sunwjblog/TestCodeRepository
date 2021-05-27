package com.sunwj.proxy.code.staticproxy;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/27 10:34 下午
 */
public class TestExpressDelivery {

    public static void main(String[] args) {
        ExpressDeliveryService expressDeliveryService = new ExpressDeliveryServiceImpl();
        ExpressDeliveryProxy expressDeliveryProxy = new ExpressDeliveryProxy(expressDeliveryService);
        expressDeliveryProxy.send("广州番禺");
    }
}
