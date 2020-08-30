package com.zhangtuzi.javastudy.demo3;

public class GenericUtil {

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
