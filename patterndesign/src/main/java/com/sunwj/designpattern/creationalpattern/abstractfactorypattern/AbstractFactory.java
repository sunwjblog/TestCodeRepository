package com.sunwj.designpattern.creationalpattern.abstractfactorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:08 下午
 */
public abstract class AbstractFactory {

    public abstract Phone createPhone(String brand);

    public abstract Computer createComputer(String brand);
}
