package com.github.muhammedshaheer.designpatterns.decoratorpattern.beverages;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
