package com.sunwj.designpattern.structuralpattern.flyweightpattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/20 7:53 下午
 */
@Setter
@Getter
@ToString
public class Memory {

    private int size;
    private boolean isused;
    private String id;

    public Memory(int size, boolean isused, String id) {
        this.size = size;
        this.isused = isused;
        this.id = id;
    }
}
