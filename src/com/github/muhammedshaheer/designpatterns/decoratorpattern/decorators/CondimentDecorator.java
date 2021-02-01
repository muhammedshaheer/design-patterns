package com.github.muhammedshaheer.designpatterns.decoratorpattern.decorators;

import com.github.muhammedshaheer.designpatterns.decoratorpattern.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
