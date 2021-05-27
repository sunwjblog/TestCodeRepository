package com.sunwj.proxy.code.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/27 11:00 下午
 */
public class JdkProxyFactory {

    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new ExpressDeliveryHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
    }
}
