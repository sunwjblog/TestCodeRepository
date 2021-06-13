package com.sunwj.designpattern.creationalpattern.protorypattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/13 10:30 上午
 */
public class MainTest {

    public static void main(String[] args) {

        // 浅复制
        Computer computer = new Computer("8core", "16G", "1TB");
        System.out.println("浅复制 computer before>>" + computer);
        Computer computerClone = (Computer) computer.clone();
        System.out.println("浅复制 computer after>>" + computerClone);

        // 深复制
        Disk disk = new Disk("208G", "2TB");
        ComputerDetail computerDetail = new ComputerDetail("8core", "16G", disk);
        System.out.println("深复制 computerDetail before>>" + computerDetail);
        ComputerDetail computerDetailClone = (ComputerDetail) computerDetail.clone();
        System.out.println("浅复制 computerDetail after>>" + computerDetailClone);
    }
}
