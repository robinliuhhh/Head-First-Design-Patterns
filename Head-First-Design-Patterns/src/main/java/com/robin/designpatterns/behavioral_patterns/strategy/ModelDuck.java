package com.robin.designpatterns.behavioral_patterns.strategy;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        // 当 ModelDuck 实例化时，它的构造器会把继承来的 quackBehavior 实例变量初始化成 Quack 类型的新实例
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
