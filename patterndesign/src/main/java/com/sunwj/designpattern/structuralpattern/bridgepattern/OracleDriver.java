package com.sunwj.designpattern.structuralpattern.bridgepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 9:45 下午
 */
public class OracleDriver implements Driver{
    @Override
    public void executeSQL() {
        System.out.println("execute sql by Oracle Driver.");
    }
}
