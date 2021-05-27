package com.sunwj.proxy.code.staticproxy;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/27 10:32 下午
 */
public class ExpressDeliveryProxy implements ExpressDeliveryService{

    private ExpressDeliveryService expressDeliveryService;

    public ExpressDeliveryProxy(ExpressDeliveryService expressDeliveryService) {
        this.expressDeliveryService = expressDeliveryService;
    }

    @Override
    public void send(String addr) {
        System.out.println("before send()");
        expressDeliveryService.send(addr);
        System.out.println("after send()");
    }
}
