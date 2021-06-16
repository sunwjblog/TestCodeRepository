package com.sunwj.designpattern.structuralpattern.bridgepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 9:47 下午
 */
public class MyDriverBridge extends DriverManangerBridge{

    public void execute() {
        getDriver().executeSQL();
    }
}
