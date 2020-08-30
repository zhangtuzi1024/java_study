package com.zhangtuzi.javastudy.demo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Foo{
    String[] value();
    boolean bar();
}
