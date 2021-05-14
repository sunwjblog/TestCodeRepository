package com.sunwj.code.repository.sunwjcoderepository.redis.test;

import java.io.Serializable;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2020/9/17 2:33 下午
 */
public class Person1 implements Serializable {

    private String name;
    private String add;
    private Integer age;

    public Person1(String name, String add, Integer age) {
        this.name = name;
        this.add = add;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
