package com.sunwj.designpattern.structuralpattern.apaterpattern.interfaceadapter;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 1:08 下午
 */
public class SourceSub2 extends AbstractAdapter{

    @Override
    public void editWordFile() {
        System.out.println("a word file editing");
    }
}
