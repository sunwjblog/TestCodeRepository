package com.sunwj.designpattern.creationalpattern.protorypattern;

import lombok.ToString;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/13 10:28 上午
 */
@ToString
public class Disk implements Cloneable {

    private String ssd;
    private String hhd;

    public Disk(String ssd, String hhd) {
        this.ssd = ssd;
        this.hhd = hhd;
    }

    public Object clone() {
        try {
            return (Disk)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
