package com.robin.designpatterns.behavioral_patterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

//        Duck mallard = new MallardDuck();
//        // 调用继承来的 quackBehavior 的 quack()
//        mallard.performQuack(); // Quack
//        mallard.performFly(); // I'm flying!!

        Duck model = new ModelDuck();
        model.performFly(); // I can't fly
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly(); // I'm flying with a rocket
    }
}
