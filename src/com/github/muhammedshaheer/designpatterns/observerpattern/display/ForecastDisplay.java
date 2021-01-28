package com.github.muhammedshaheer.designpatterns.observerpattern.display;

import com.github.muhammedshaheer.designpatterns.observerpattern.DisplayElement;
import com.github.muhammedshaheer.designpatterns.observerpattern.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements DisplayElement, Observer {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
