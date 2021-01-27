package com.github.muhammedshaheer.designpatterns.simuduck;

import com.github.muhammedshaheer.designpatterns.simuduck.fly.FlyNoWay;
import com.github.muhammedshaheer.designpatterns.simuduck.quack.Quack;

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
