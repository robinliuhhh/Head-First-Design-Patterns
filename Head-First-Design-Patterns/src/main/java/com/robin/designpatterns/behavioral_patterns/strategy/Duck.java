package com.robin.designpatterns.behavioral_patterns.strategy;

public abstract class Duck {

    // 为行为接口类型声明两个引用变量，所有鸭子子类（在同一个 package）都继承它们
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 在运行时想改变鸭子的行为，只要调用鸭子的setter方法就可以
     */
    public void setFlyBehavior(FlyBehavior fb) {
        // 不用在鸭子的构造器内实例化
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        // 不用在鸭子的构造器内实例化
        quackBehavior = qb;
    }

    abstract void display();

    public void performFly() {
        // 委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        // 委托给行为类
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
