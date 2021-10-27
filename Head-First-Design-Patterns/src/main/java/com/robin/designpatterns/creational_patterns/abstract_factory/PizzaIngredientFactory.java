package com.robin.designpatterns.creational_patterns.abstract_factory;

// 抽象工厂模式：定义了一个接口，里面包含一组方法用来生产产品；具体工厂必须实现此接口生产对应产品
// 接口 对象的组合
public interface PizzaIngredientFactory {

    // 内嵌工厂方法模式：允许子类决定实例化对象的类型
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
