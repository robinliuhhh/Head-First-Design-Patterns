package com.robin.designpatterns.structural_patterns.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    // 所有的调料装饰者都必须重新实现getDescription()方法
    public abstract String getDescription();
}
