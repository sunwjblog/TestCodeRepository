package com.sunwj.code.repository.sunwjcoderepository.spring;

import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/4/27 4:13 下午
 */
public class BeanCopyPropertisTest {

    public static void main(String[] args) {
        /*Student student = new Student()
                .setAddr("GZ")
                .setAge(1)
                .setName("weijie")
                .setStartTime(new Date());
        System.out.println("对象转换前 --> "+ student);
        Employee employee = new Employee();
        BeanUtils.copyProperties(student,employee);

        System.out.println("对象转换后 --> "+employee);*/
        UserTwo u2 = new UserTwo();
        u2.setId(1);
        u2.setName("xy");
        u2.setAddress("aa");
        UserThree u3 = new UserThree();
        BeanUtils.copyProperties(u2, u3);
        System.out.println(u3);
    }
}
