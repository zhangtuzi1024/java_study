package com.zhangtuzi.javastudy.demo4;

import java.util.List;

public class AnimalUtil {

    /**
     * 上界通配符，所有子类都可以
     *
     * @param animals
     * @return
     */
    public static int countLegs1(List<? extends Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.legCount();
        }
        return retVal;
    }

    /**
     * 下界通配符，所有父类都可以
     *
     * @param dst
     * @param src
     * @return
     */
    public static <T> void addAll(List<? super T> dst, List<T> src) {
        for (T t : src) {
            dst.add(t);
        }
    }

    public static int countLegs2(List<Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.legCount();
        }
        return retVal;
    }
}
