package com.sunwj.designpattern.creationalpattern.abstractfactorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:12 下午
 */
public class PhoneFactory extends AbstractFactory {

    @Override
    public Phone createPhone(String brand) {

        if ("HuaWei".equals(brand))
            return new HuaWeiPhone();
        else if ("Apple".equals(brand))
            return new ApplePhone();
        else
            return null;
    }

    @Override
    public Computer createComputer(String brand) {
        return null;
    }
}
