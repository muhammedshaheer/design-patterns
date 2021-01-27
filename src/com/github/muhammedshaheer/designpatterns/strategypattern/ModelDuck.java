package com.github.muhammedshaheer.designpatterns.strategypattern;

import com.github.muhammedshaheer.designpatterns.strategypattern.fly.FlyNoWay;
import com.github.muhammedshaheer.designpatterns.strategypattern.quack.Quack;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
