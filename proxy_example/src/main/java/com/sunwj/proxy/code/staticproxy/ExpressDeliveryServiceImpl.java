package com.sunwj.proxy.code.staticproxy;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/27 10:32 下午
 */
public class ExpressDeliveryServiceImpl implements ExpressDeliveryService{
    @Override
    public void send(String addr) {
        System.out.println("快递地址： " + addr);
    }
}
