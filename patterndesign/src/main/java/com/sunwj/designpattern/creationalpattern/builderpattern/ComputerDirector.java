package com.sunwj.designpattern.creationalpattern.builderpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/13 10:04 上午
 */
public class ComputerDirector {

    public Computer constructComputer(ComputerBuilder computerBuilder) {
        computerBuilder.builderMerory();
        computerBuilder.builderCpu();
        computerBuilder.builderDisk();
        return computerBuilder.builderComputer();
    }
}
