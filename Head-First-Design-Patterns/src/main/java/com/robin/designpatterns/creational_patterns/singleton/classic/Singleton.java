package com.robin.designpatterns.creational_patterns.singleton.classic;

// NOTE: This is not thread safe!

public class Singleton {
    // 利用一个静态变量来记录Singleton类的唯一实例
    // 静态变量在程序执行前系统就为之分配存储空间 也即在运行时不再改变分配情况
    private static Singleton uniqueInstance;

    // 私有构造器
    // 外人不能自行实例化
    private Singleton() {
    }

    // 静态方法 类名调用
    // 外人可以请求得到一个实例 该实例是静态变量 保证了唯一性
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            // 用到时再实例化 这就是 延迟实例化
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a classic Singleton!";
    }
}
