package com.sunwj.designpattern.structuralpattern.facadepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/15 10:50 下午
 */
public class Starter {

    private Dashboard dashboard;
    private Engine engine;
    private SelfCheck selfCheck;

    public Starter() {
        this.dashboard = new Dashboard();
        this.engine = new Engine();
        this.selfCheck = new SelfCheck();
    }

    public void startup() {
        System.out.println("car engin startup.");
        engine.startup();
        dashboard.startup();
        selfCheck.shutdownCheck();
        System.out.println("car engin finish.");
    }

    public void shutdown() {
        System.out.println("car engine shutdown.");
        engine.shutdown();
        dashboard.shutdown();
        selfCheck.shutdownCheck();
        System.out.println("car engine shutdown finish.");
    }
}
