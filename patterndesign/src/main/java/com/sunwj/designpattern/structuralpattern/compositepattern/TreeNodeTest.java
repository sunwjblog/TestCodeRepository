package com.sunwj.designpattern.structuralpattern.compositepattern;

/**
 * @author sunwjcoder
 * @version 1.0
 * @description
 * @date 2021/6/16 10:20 下午
 */
public class TreeNodeTest {

    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        nodeA.add(nodeB);
        // System.out.println(JSON.toJSONString(nodeA));
    }
}
