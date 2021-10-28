package com.robin.designpatterns.creational_patterns.singleton.threadsafe.eager;

public class Singleton {
    // JVM在加载这个类时就马上创建唯一的实例
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
