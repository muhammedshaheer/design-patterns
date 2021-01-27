package com.github.muhammedshaheer.designpatterns.simuduck.quack;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
