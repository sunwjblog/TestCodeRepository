package com.sunwj.code.repository.sunwjcoderepository.spring;

import jnr.ffi.annotations.In;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/4/27 4:11 下午
 */

@Accessors(chain = true)
@Setter
@Getter
@ToString
public class Student {

    private String name;

    private String addr;

    private int Age;

    private Date startTime;
}
