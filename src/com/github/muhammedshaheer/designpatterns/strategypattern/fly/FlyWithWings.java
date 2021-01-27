package com.github.muhammedshaheer.designpatterns.strategypattern.fly;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flying!!");
    }
}
