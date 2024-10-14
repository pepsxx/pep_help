package suleimanov.design.patterns.behavioral.mediator;

public class UserAdmin implements User {

    Chat chat;
    String name;

    public UserAdmin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
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
