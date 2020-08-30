package com.zhangtuzi.javastudy;

import com.zhangtuzi.javastudy.demo1.Generic;

/**
 * 泛型类测试入口
 */
public class GenericClassMain {

    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<Integer>(123456);
        System.out.println(genericInteger.getKey());
    }
}
