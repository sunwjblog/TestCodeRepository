package com.sunwj.designpattern.structuralpattern.decoratorpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 1:45 下午
 */
public class MainTest {

    public static void main(String[] args) {
        Decorator decorator = new Decorator(new Source());
        decorator.createComputer();
    }
}
