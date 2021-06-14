package com.sunwj.designpattern.structuralpattern.decoratorpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 1:42 下午
 */
public class Source implements SourceAble{
    @Override
    public void createComputer() {
        System.out.println("create Computer by Source");
    }
}
