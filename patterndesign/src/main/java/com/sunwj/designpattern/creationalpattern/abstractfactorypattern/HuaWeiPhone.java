package com.sunwj.designpattern.creationalpattern.abstractfactorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:11 下午
 */
public class HuaWeiPhone implements Phone{
    @Override
    public String call() {
        return "this is a HuaWei Phone";
    }
}
