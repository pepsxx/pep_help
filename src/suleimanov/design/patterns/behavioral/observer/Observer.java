package suleimanov.design.patterns.behavioral.observer;

import java.util.List;

public interface Observer {

    void handleEvent (List<String> vacancies);
    void subscribe (Producer producer);
    void unsubscribe (Producer producer);

}
