package com.robin.designpatterns.creational_patterns.abstract_factory;

// 具体工厂必须实现抽象接口生产对应产品
// 对象的组合 使用实现implements
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    // 内嵌工厂方法模式：允许子类决定实例化对象的类型
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
