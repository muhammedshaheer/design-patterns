package com.github.muhammedshaheer.designpatterns.strategypattern.fly;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
