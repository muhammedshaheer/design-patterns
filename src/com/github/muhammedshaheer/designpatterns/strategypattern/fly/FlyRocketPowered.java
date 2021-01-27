package com.github.muhammedshaheer.designpatterns.strategypattern.fly;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
