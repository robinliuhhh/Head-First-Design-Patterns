package com.robin.designpatterns.creational_patterns.singleton.threadsafe.dcl;

// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5

public class Singleton {
    // volatile关键字
    // 禁止指令重排序

    /**
     * 原因：在某个线程执行到第一次检测，读取到的instance不为null时，instance对象可能没有完成初始化。
     *
     * uniqueInstance = new Singleton();可以分为以下3步完成（伪代码）
     *
     * memory = allocate();         // 1.分配内存对象空间
     * uniqueInstance = (memory);   // 2.初始化对象
     * uniqueInstance = memory;     // 3.设置uniqueInstance指向刚分配的内存地址 此时uniqueInstance != null
     *
     * 由于步骤2和步骤3不存在数据依赖关系，而且无论重排前还是重排后程序的执行结果在单线程中并没有改变，因此这种重排优化是允许的。
     */
    private volatile static Singleton uniqueInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
