package com.sunwj.designpattern.behavioralpattern.observerpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/27 9:20 下午
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        subject.add(obs);
        subject.notifyObserver("data1");
    }
}
