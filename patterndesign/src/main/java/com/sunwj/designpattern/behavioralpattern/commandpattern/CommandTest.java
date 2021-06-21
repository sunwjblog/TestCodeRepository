package com.sunwj.designpattern.behavioralpattern.commandpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/21 5:34 下午
 */
public class CommandTest {

    public static void main(String[] args) {
        // 定义命令的接收和执行者
        Receiver receiver = new Receiver();
        // 定义命令实现者
        Command command = new ConcreteCommand(receiver);
        // 定义命令的调用者
        Invoker invoker = new Invoker(command);
        invoker.action("command1");
    }
}
