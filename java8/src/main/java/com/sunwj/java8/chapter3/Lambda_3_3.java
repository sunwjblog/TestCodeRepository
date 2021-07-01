package com.sunwj.java8.chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/7/1 11:48 上午
 */
public class Lambda_3_3 {

    public static void main(String[] args) throws IOException {

        String oneLine = processFile((BufferedReader br) -> br.readLine());

        String twoLine = processFile((BufferedReader br) -> br.readLine() + br.readLine());

    }

    public static String processFile() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            return p.process(br);
        }
    }
}
