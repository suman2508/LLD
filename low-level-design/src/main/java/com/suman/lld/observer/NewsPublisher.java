package com.suman.lld.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NewsPublisher implements Subject{
    private final List<Observer> observers = new CopyOnWriteArrayList<>();
    private String latestNews;
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for(Observer o : observers)
        {
            try{
                o.update();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void publishNews(String news){
        this.latestNews = news;
        notifyObservers();
    }

    public String getLatestNews()
    {
        return latestNews;
    }

}
