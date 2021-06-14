package com.sunwj.designpattern.structuralpattern.apaterpattern.objectadapter;

import lombok.extern.log4j.Log4j;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 12:30 下午
 */
public class MainTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new ObjectAdapter(source);
        targetable.editTextFile();
        targetable.editWordFile();
    }
}
