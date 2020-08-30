package com.zhangtuzi.javastudy;

import com.zhangtuzi.javastudy.demo4.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型上下界测试入口
 */
public class GenericExtendsSuperMain {

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        List<Monkey> monkeys = new ArrayList<>();
        monkeys.add(new Monkey());

        // 不会报错
        System.out.println(AnimalUtil.countLegs1(dogs));
        // 报错
        //AnimalUtil.countLegs2(dogs);
        //下界
        List<Animal> animals = new ArrayList<>();
        AnimalUtil.addAll(animals, dogs);
        AnimalUtil.addAll(animals, cats);
        AnimalUtil.addAll(animals, monkeys);
        System.out.println(AnimalUtil.countLegs1(animals));
    }
}
