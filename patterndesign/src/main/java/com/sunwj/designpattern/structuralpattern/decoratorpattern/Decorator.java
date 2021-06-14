package com.sunwj.designpattern.structuralpattern.decoratorpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 1:43 下午
 */
public class Decorator implements SourceAble{

    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }

    @Override
    public void createComputer() {
        source.createComputer();
        System.out.println("购完电脑，然后装系统。");
    }
}
