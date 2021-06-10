package com.sunwj.designpattern.creationalpattern.factorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 9:50 下午
 */
public class Factory {

    public Phone createPhonr(String phoneName) {
        if ("Apple".equals(phoneName))
            return new ApplePhone();
        else if ("HuaWei".equals(phoneName))
            return new HuaWeiPhone();
        else
            return null;
    }
}
