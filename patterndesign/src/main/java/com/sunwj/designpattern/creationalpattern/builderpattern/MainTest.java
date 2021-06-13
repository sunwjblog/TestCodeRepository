package com.sunwj.designpattern.creationalpattern.builderpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/13 10:08 上午
 */
public class MainTest {

    public static void main(String[] args) {

        Computer computer = new Computer();
        ComputerBuilder computerBuilder = new ComputerConcreteBuilder(computer);
        ComputerDirector computerDirector = new ComputerDirector();
        computerDirector.constructComputer(computerBuilder);
        System.out.println(computer);
    }
}
