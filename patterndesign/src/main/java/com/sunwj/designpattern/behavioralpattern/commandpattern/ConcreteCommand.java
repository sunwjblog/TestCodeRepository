package com.sunwj.designpattern.behavioralpattern.commandpattern;


/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/21 5:31 下午
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe(String command) {
        receiver.action(command);
    }
}
