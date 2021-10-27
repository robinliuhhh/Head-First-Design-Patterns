package com.robin.designpatterns.creational_patterns.abstract_factory;

// 具体工厂必须实现抽象接口生产对应产品
// 对象的组合 使用实现implements
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    // 内嵌工厂方法模式：允许子类决定实例化对象的类型
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
