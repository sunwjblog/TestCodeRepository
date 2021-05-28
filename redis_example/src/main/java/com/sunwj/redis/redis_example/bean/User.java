package com.sunwj.redis.redis_example.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/5/28 3:33 下午
 */
@Data
@AllArgsConstructor
public class User implements Serializable {

    private String email;
    private String name;
    private String addr;
    private String name1;
    private String mobile;
}
