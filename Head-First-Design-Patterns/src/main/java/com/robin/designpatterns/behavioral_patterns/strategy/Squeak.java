package com.robin.designpatterns.behavioral_patterns.strategy;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
