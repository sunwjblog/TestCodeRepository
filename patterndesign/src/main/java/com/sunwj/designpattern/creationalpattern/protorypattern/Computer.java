package com.sunwj.designpattern.creationalpattern.protorypattern;

import lombok.ToString;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description 浅复制
 * @date 2021/6/13 10:25 上午
 */
@ToString
public class Computer implements Cloneable {

    private String cpu;
    private String memory;
    private String disk;

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public Object clone() {
        try {
            return (Computer)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
