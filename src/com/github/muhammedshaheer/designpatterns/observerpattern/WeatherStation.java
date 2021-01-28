package com.github.muhammedshaheer.designpatterns.observerpattern;

import com.github.muhammedshaheer.designpatterns.observerpattern.display.CurrentConditionsDisplay;
import com.github.muhammedshaheer.designpatterns.observerpattern.display.ForecastDisplay;
import com.github.muhammedshaheer.designpatterns.observerpattern.display.HeatIndexDisplay;
import com.github.muhammedshaheer.designpatterns.observerpattern.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
