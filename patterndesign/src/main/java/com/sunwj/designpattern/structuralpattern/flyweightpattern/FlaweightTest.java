package com.sunwj.designpattern.structuralpattern.flyweightpattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/20 9:32 下午
 */
public class FlaweightTest {

    public static void main(String[] args) {

        // 首次获取内存，将创建一个内存
        Memory memory = MemoryFactory.getMemory(32);
        // 在使用后释放内存
        MemoryFactory.releaseMemory(memory.getId());
        // 重新获取内存
        MemoryFactory.getMemory(32);
    }
}
