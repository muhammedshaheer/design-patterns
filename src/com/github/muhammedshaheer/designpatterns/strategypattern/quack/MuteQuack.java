package com.github.muhammedshaheer.designpatterns.strategypattern.quack;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
