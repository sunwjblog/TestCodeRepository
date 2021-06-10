package com.sunwj.designpattern.creationalpattern.factorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 9:50 下午
 */
public class HuaWeiPhone implements Phone{
    @Override
    public void brand() {
        System.out.println("this is a HuaWei Phone");
    }
}
