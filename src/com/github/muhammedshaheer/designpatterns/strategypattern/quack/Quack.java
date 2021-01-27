package com.github.muhammedshaheer.designpatterns.strategypattern.quack;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
