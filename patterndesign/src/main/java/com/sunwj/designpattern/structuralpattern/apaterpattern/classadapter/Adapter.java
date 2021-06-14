package com.sunwj.designpattern.structuralpattern.apaterpattern.classadapter;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 12:30 下午
 */
public class Adapter extends Source implements Targetable{

    @Override
    public void editTextFile() {
        super.editFile();
    }

    @Override
    public void editWordFile() {
        System.out.println(" a word file editing");
    }
}
