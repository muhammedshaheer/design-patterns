package com.github.muhammedshaheer.designpatterns.observerpattern.external;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
