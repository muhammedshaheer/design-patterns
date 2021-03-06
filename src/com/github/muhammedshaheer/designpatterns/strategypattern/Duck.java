package com.github.muhammedshaheer.designpatterns.strategypattern;

import com.github.muhammedshaheer.designpatterns.strategypattern.fly.FlyBehaviour;
import com.github.muhammedshaheer.designpatterns.strategypattern.quack.QuackBehaviour;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
