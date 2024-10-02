package suleimanov.design.patterns.behavioral.observer;

import java.util.List;

public class Subscriber implements Observer {

    String name;

    public Subscriber(String name) {
        this.name = name;
    }



    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + " received " + vacancies.size() + " vacancies: " + vacancies.toString());
    }

    @Override
    public void subscribe(Producer producer) {
        producer.addObserver(this);
    }

    @Override
    public void unsubscribe(Producer producer) {
        producer.removeObserver(this);
    }
}
