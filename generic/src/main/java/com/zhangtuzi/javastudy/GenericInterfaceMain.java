package com.zhangtuzi.javastudy;

import com.zhangtuzi.javastudy.demo2.Generator;
import com.zhangtuzi.javastudy.demo2.GeneratorImpl;

/**
 * 泛型接口测试入口
 */
public class GenericInterfaceMain {

    public static void main(String[] args) {
        Generator<Integer> generic = new GeneratorImpl<Integer>();
        System.out.println(generic.method());
    }
}
