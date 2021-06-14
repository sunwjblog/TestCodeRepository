package com.sunwj.designpattern.structuralpattern.apaterpattern.objectadapter;

import lombok.extern.java.Log;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/14 12:30 下午
 */
public class ObjectAdapter implements Targetable {

    private Source source;

    public ObjectAdapter(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void editTextFile() {
        this.source.editFile();
    }

    @Override
    public void editWordFile() {
        System.out.println(" a word file editing");
    }
}
