package com.sunwj.designpattern.behavioralpattern.commandpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/21 5:31 下午
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {

        this.command = command;
    }

    public void action(String commandMessage) {

        System.out.println("Command sending....");
        command.exe(commandMessage);
    }
}
