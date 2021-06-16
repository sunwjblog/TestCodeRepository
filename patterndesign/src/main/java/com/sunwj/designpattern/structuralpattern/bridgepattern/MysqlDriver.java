package com.sunwj.designpattern.structuralpattern.bridgepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 9:43 下午
 */
public class MysqlDriver implements Driver {

    @Override
    public void executeSQL() {
        System.out.println("execute sql by Mysql Driver.");
    }
}
