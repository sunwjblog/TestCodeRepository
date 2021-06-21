package com.sunwj.designpattern.behavioralpattern.chainpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/21 4:17 下午
 */
public class BusinessHandler extends AbstractHandler implements Handler {

    private String name;
    public BusinessHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("business info handler....");
        if (getHandler()!=null) {
            // 执行责任链的下一个流程
            getHandler().operator();
        }
    }
}