package com.suman.lld.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

    String getLatestNews();
}
