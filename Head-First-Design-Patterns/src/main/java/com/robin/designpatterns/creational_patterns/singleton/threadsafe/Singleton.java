package com.robin.designpatterns.creational_patterns.singleton.threadsafe;

public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here

    private Singleton() {
    }

    // synchronized关键字
    // 保证每个线程在进入这个方法前 要先等候别的线程离开该方法
    // 也就是说 不会有两个线程可以同时进入这个方法
    public static synchronized Singleton getInstance() {
        // 只有第一次执行该方法时才真正需要同步
        // 一旦uniqueInstance不为空 之后每次调用该方法 同步都是一种累赘
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
