package com.github.muhammedshaheer.designpatterns.strategypattern.quack;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
