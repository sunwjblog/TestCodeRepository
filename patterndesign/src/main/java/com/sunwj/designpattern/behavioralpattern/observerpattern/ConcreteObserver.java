package com.sunwj.designpattern.behavioralpattern.observerpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/27 9:19 下午
 */
public class ConcreteObserver implements Observer{
    @Override
    public void dataChange(String message) {
        System.out.println("recive meaage:" + message);
    }
}
