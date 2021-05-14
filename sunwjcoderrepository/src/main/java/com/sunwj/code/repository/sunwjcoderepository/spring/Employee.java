package com.sunwj.code.repository.sunwjcoderepository.spring;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/4/27 4:12 下午
 */
@Accessors(chain = true)
@Setter
@Getter
@ToString
public class Employee {

    private String name;

    private String addr;

    private String age;

    private String title;

    private String startTime;
}
