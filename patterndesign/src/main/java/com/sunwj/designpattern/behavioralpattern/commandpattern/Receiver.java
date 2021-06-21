package com.sunwj.designpattern.behavioralpattern.commandpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/21 5:32 下午
 */
public class Receiver {
    public void action(String command) {
        // 接收并执行命令
        System.out.println("command received, now execute command");
    }
}
