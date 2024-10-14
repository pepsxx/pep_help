package suleimanov.design.patterns.behavioral.mediator;

public class UserSimple implements User {

    Chat chat;
    String name;

    public UserSimple(Chat chat, String name) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessages(String message) {
        System.out.println(message + ".");
    }
}
