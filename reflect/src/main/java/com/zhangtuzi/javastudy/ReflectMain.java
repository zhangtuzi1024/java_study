package com.zhangtuzi.javastudy;

import com.zhangtuzi.javastudy.demo.ReflectObject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException {
        /**
         * 获取ReflectObject类的Class对象并且创建ReflectObject类实例
         */
        Class<?> reflectObject = Class.forName("com.zhangtuzi.javastudy.demo.ReflectObject");
        ReflectObject ReflectObject = (ReflectObject) reflectObject.newInstance();

        /**
         * 获取所有类中所有定义的方法
         */
        Method[] methods = reflectObject.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        /**
         * 获取指定方法并调用
         */
        Method publicMethod = reflectObject.getDeclaredMethod("publicMethod", String.class);
        publicMethod.invoke(ReflectObject, "javastudy");

        /**
         * 获取指定参数并对参数进行修改
         */
        Field field = reflectObject.getDeclaredField("value");
        //为了对类中的参数进行修改我们取消安全检查
        field.setAccessible(true);
        field.set(ReflectObject, "javastudy");

        /**
         * 调用 private 方法
         */
        Method privateMethod = reflectObject.getDeclaredMethod("privateMethod");
        //为了调用private方法我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(ReflectObject);
    }
}
