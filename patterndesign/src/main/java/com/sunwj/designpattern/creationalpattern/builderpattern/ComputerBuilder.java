package com.sunwj.designpattern.creationalpattern.builderpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/13 9:51 上午
 */
public interface ComputerBuilder {

    void builderCpu();

    void builderMerory();

    void builderDisk();

    Computer builderComputer();
}
