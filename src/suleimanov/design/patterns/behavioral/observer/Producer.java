package suleimanov.design.patterns.behavioral.observer;

public interface Producer {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
