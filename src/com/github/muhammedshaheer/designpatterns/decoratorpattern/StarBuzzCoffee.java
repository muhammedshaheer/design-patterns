package com.github.muhammedshaheer.designpatterns.decoratorpattern;

import com.github.muhammedshaheer.designpatterns.decoratorpattern.beverages.Beverage;
import com.github.muhammedshaheer.designpatterns.decoratorpattern.beverages.DarkRoast;
import com.github.muhammedshaheer.designpatterns.decoratorpattern.beverages.Espresso;
import com.github.muhammedshaheer.designpatterns.decoratorpattern.beverages.HouseBlend;
import com.github.muhammedshaheer.designpatterns.decoratorpattern.decorators.Mocha;
import com.github.muhammedshaheer.designpatterns.decoratorpattern.decorators.Soy;
import com.github.muhammedshaheer.designpatterns.decoratorpattern.decorators.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " - $" + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " - $" + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " - $" + houseBlend.cost());
    }
}
