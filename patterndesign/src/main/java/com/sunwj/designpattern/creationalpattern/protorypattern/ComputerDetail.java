package com.sunwj.designpattern.creationalpattern.protorypattern;

import lombok.ToString;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description 深复制
 * @date 2021/6/13 10:28 上午
 */
@ToString
public class ComputerDetail implements Cloneable {

    private String cpu;
    private String memory;
    private Disk disk;

    public ComputerDetail(String cpu, String memory, Disk disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public Object clone() {
        try {
            return (ComputerDetail)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
