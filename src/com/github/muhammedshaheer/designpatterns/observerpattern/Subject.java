package com.github.muhammedshaheer.designpatterns.observerpattern;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
