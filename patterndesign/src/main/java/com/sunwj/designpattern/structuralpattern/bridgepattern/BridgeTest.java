package com.sunwj.designpattern.structuralpattern.bridgepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 9:48 下午
 */
public class BridgeTest {

    public static void main(String[] args) {

        DriverManangerBridge driverManangerBridge = new DriverManangerBridge();

        MysqlDriver mysqlDriver = new MysqlDriver();
        driverManangerBridge.setDriver(mysqlDriver);
        driverManangerBridge.executeSQL();


        OracleDriver oracleDriver = new OracleDriver();
        driverManangerBridge.setDriver(oracleDriver);
        driverManangerBridge.executeSQL();
    }
}
