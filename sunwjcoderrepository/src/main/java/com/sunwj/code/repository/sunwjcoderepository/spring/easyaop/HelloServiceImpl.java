package com.sunwj.code.repository.sunwjcoderepository.spring.easyaop;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHelloWorld() {
        System.out.println("hello world!");
    }
}
