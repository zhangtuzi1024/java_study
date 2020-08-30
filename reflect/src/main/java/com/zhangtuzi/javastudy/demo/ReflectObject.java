package com.zhangtuzi.javastudy.demo;

public class ReflectObject {
    private String value;

    public ReflectObject() {
        value = "ReflectObject";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
