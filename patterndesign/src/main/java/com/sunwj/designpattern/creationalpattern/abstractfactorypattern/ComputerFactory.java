package com.sunwj.designpattern.creationalpattern.abstractfactorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/10 10:12 下午
 */
public class ComputerFactory extends AbstractFactory {

    @Override
    public Phone createPhone(String brand) {
        return null;
    }

    @Override
    public Computer createComputer(String brand) {
        if ("HuaWei".equals(brand))
            return new HuaWeiComputer();
        else if ("Apple".equals(brand))
            return new ComputerApple();
        else
            return null;
    }
}
