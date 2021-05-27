package com.sunwj.proxy.code.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/27 10:58 下午
 */
public class ExpressDeliveryHandler implements InvocationHandler {

    /**
     * 代理类中的真实对象
     */
    private final Object target;

    public ExpressDeliveryHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("before method " + method.getName());
        Object result = method.invoke(target, args);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("after method " + method.getName());
        return result;
    }
}
