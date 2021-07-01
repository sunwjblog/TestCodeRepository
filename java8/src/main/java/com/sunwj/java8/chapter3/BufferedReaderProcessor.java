package com.sunwj.java8.chapter3;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/7/1 11:19 上午
 */
@FunctionalInterface
interface BufferedReaderProcessor {

    String process(BufferedReader br) throws IOException;
}

