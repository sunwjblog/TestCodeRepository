package com.sunwj.designpattern.structuralpattern.bridgepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 9:45 下午
 */
public class DriverManangerBridge {

    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void executeSQL() {
        this.driver.executeSQL();
    }
}
