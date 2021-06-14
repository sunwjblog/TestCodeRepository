package com.sunwj.designpattern.structuralpattern.apaterpattern.interfaceadapter;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 1:05 下午
 */
public abstract class AbstractAdapter implements SourceAble {

    // 定义了SourceAble的抽象实现类AbstractAdapter，该类对SourceAble进行重写，
    // 但是不做具体实现。

    @Override
    public void editTextFile() {

    }

    @Override
    public void editWordFile() {

    }
}
