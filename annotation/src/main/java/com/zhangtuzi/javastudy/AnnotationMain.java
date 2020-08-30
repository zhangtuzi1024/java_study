package com.zhangtuzi.javastudy;

import com.zhangtuzi.javastudy.demo.Foo;

import java.util.Arrays;

@Foo(value = {"sherman", "decompiler"}, bar = true)
public class AnnotationMain {
    public static void main(String[] args) {
        Foo foo = AnnotationMain.class.getAnnotation(Foo.class);
        System.out.println(Arrays.toString(foo.value())); // [sherman, decompiler]
        System.out.println(foo.bar());                    // true
    }
}
