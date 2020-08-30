package com.zhangtuzi.javastudy.demo1;

/**
 * 泛化类
 * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 *
 * @param <T>
 */
public class Generic<T> {

    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
