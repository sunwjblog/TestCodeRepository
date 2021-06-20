package com.sunwj.designpattern.structuralpattern.flyweightpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/20 7:54 下午
 */
public class MemoryFactory {

    private static List<Memory> memoryList = new ArrayList<>();

    public static Memory getMemory(int size) {
        Memory memory = null;
        for (int i = 0; i < memoryList.size(); i++) {
            memory = memoryList.get(i);
            // 如果存在和需求size一样大小并且未使用的内存块，则直接返回
            if (memory.getSize() == size && memory.isIsused() == false) {
                memory.setIsused(true);
                memoryList.set(i,memory);
                System.out.println("get memory form memoryList:" + memory);
                break;
            }
        }

        // 如果内存不存在，则从系统中申请新的内存返回，并将该内存加入内存对象列表中
        if (memory == null) {
            memory = new Memory(32, false, UUID.randomUUID().toString());
            System.out.println("create a new memory form system and add to memoryList: " + memory);
            memoryList.add(memory);
        }
        return memory;
    }

    public static void releaseMemory(String id) {
        for (int i = 0; i < memoryList.size(); i++) {

            Memory memory = memoryList.get(i);
            // 如果存在和需求size一样大小并且未使用的内存块，则直接返回
            if (memory.getId().equals(id)) {
                memory.setIsused(false);
                memoryList.set(i, memory);
                System.out.println("release memory: " + id);
                break;
            }

        }
    }
}
