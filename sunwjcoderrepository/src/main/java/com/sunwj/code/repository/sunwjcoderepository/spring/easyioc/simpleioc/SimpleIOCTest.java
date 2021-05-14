package com.sunwj.code.repository.sunwjcoderepository.spring.easyioc.simpleioc;


import com.sunwj.code.repository.sunwjcoderepository.spring.easyioc.bean.Car;
import com.sunwj.code.repository.sunwjcoderepository.spring.easyioc.bean.Wheel;
import org.junit.Test;

public class SimpleIOCTest {

    @Test
    public void getBean() throws Exception {
        String location = SimpleIoc.class.getClassLoader().getResource("ioc.xml").getFile();
        SimpleIoc bf = new SimpleIoc(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
