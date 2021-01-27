package com.github.muhammedshaheer.designpatterns.strategypattern;

import com.github.muhammedshaheer.designpatterns.strategypattern.fly.FlyRocketPowered;

/**
 * @author Muhammed Shaheer
 * @since 27 January 2021
 */

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
