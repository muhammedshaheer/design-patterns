package com.github.muhammedshaheer.designpatterns.simuduck;

import com.github.muhammedshaheer.designpatterns.simuduck.fly.FlyWithWings;
import com.github.muhammedshaheer.designpatterns.simuduck.quack.Quack;

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
