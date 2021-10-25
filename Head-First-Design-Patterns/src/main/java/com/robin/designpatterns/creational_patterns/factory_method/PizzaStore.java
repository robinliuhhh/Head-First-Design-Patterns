package com.robin.designpatterns.creational_patterns.factory_method;

public abstract class PizzaStore {

    // 在父类中提供一个创建对象的接口以允许子类决定实例化对象的类型
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
