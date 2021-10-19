package com.robin.designpatterns.behavioral_patterns.strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
