package com.sunwj.designpattern.creationalpattern.builderpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/13 9:52 上午
 */
public class ComputerConcreteBuilder implements ComputerBuilder{

    private Computer computer;

    public ComputerConcreteBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void builderCpu() {
        System.out.println("构造电脑cpu");
        this.computer.setCpu("苹果M1");
    }

    @Override
    public void builderMerory() {
        System.out.println("构造电脑内存");
        this.computer.setMerory("DRR4");
    }

    @Override
    public void builderDisk() {
        System.out.println("构造电脑硬盘");
        this.computer.setDisk("Disk");
    }

    @Override
    public Computer builderComputer() {
        return computer;
    }
}
