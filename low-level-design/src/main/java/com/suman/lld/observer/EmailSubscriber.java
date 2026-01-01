package com.suman.lld.observer;

public class EmailSubscriber implements Observer{
    private final String name;
    private final Subject publisher;

    public EmailSubscriber(String name, Subject publisher)
    {
        this.name = name;
        this.publisher = publisher;
    }

    @Override
    public void update(){
        String news = publisher.getLatestNews();
        System.out.println(name + "(email) pulled: "+ news);
    }
}
