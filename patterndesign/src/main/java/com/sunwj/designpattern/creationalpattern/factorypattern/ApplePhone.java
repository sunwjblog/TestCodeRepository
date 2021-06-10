package com.sunwj.designpattern.creationalpattern.factorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 9:49 下午
 */
public class ApplePhone implements Phone{
    @Override
    public void brand() {
        System.out.println("this is a Apple Phone");
    }
}
