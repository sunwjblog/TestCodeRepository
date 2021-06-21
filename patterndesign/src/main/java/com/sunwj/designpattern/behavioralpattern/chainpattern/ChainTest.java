package com.sunwj.designpattern.behavioralpattern.chainpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/21 4:19 下午
 */
public class ChainTest {

    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("auth");
        BusinessHandler businessHandler = new BusinessHandler("business");
        ResponseHandler responseHandler = new ResponseHandler("response");
        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(responseHandler);
        authHandler.operator();
    }
}
