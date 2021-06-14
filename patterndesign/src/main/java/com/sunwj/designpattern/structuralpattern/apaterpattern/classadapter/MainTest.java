package com.sunwj.designpattern.structuralpattern.apaterpattern.classadapter;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 12:30 下午
 */
public class MainTest {

    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        targetable.editTextFile();
        targetable.editWordFile();
    }
}
