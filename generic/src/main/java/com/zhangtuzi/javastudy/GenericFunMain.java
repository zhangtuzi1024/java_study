package com.zhangtuzi.javastudy;

import com.zhangtuzi.javastudy.demo3.GenericUtil;

/**
 * 泛型方法测试入口
 */
public class GenericFunMain {

    public static void main(String[] args) {
        GenericUtil.printArray(new Integer[]{1, 2, 3, 4, 5});
        GenericUtil.printArray(new String[]{"a", "b", "c", "d", "e"});
    }
}
