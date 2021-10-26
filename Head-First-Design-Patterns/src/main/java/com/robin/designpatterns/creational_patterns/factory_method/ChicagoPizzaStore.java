package com.robin.designpatterns.creational_patterns.factory_method;

// 使用工厂方法模式
// 创建类 使用继承extends
public class ChicagoPizzaStore extends PizzaStore {

    // 覆盖工厂方法
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
