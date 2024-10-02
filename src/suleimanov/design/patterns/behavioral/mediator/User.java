package suleimanov.design.patterns.behavioral.mediator;

public interface User {
    void sendMessage(String message);
    void getMessages(String message);
    String getName();
}
