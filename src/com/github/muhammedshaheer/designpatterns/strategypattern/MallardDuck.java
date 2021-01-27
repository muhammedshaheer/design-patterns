package com.github.muhammedshaheer.designpatterns.strategypattern;

import com.github.muhammedshaheer.designpatterns.strategypattern.fly.FlyWithWings;
import com.github.muhammedshaheer.designpatterns.strategypattern.quack.Quack;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
