package com.github.muhammedshaheer.designpatterns.strategypattern.quack;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
