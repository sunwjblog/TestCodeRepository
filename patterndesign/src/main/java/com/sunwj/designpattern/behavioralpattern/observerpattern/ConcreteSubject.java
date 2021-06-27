package com.sunwj.designpattern.behavioralpattern.observerpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/27 9:16 下午
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver(String message) {
        for(Object obs : observers) {

            System.out.println("notify observer "+message+" change...");
            ((Observer)obs).dataChange(message);

        }
    }
}
