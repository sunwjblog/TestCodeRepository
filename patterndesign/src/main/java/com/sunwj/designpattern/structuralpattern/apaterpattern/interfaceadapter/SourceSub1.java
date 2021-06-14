package com.sunwj.designpattern.structuralpattern.apaterpattern.interfaceadapter;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 1:07 下午
 */
public class SourceSub1 extends AbstractAdapter{
    @Override
    public void editTextFile() {
        System.out.println("a text file editing");
    }
}
