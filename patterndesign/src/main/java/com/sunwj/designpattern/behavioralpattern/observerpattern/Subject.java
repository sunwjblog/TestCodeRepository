package com.sunwj.designpattern.behavioralpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/27 9:16 下午
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<Observer>();

    // 增加观察者

    public void add(Observer observer) {

        observers.add(observer);

    }

    // 删除观察者

    public void remove(Observer observer) {

        observers.remove(observer);

    }

    public abstract void notifyObserver(String message); // 通知观察者的抽象方法
}
