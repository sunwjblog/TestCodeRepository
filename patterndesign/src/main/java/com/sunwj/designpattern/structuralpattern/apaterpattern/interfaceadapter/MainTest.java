package com.sunwj.designpattern.structuralpattern.apaterpattern.interfaceadapter;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 1:09 下午
 */
public class MainTest {

    public static void main(String[] args) {

        SourceAble source1 = new SourceSub1();
        SourceAble source2 = new SourceSub2();
        source1.editTextFile();
        source2.editWordFile();
    }
}
