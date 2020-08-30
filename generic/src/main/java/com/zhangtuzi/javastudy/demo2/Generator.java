package com.zhangtuzi.javastudy.demo2;

/**
 * 泛化接口
 * 此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
 *
 * @param <T>
 */
public interface Generator<T> {
    public T method();
}
