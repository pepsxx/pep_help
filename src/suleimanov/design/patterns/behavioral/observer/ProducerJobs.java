package suleimanov.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ProducerJobs implements Producer {

    List<String> vacancies = new ArrayList<String>();

    List<Observer> observers = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
