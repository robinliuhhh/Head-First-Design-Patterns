package com.robin.designpatterns.creational_patterns.factory_method;

// 使用工厂方法模式
// 创建类 使用继承extends
public class NYPizzaStore extends PizzaStore {

    // 覆盖工厂方法
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
