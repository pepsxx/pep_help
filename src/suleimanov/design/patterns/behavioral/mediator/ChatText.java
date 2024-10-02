package suleimanov.design.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatText implements Chat {
    User admin;
    List<User> users = new ArrayList<User>();

    public void setAdmin(User admin) {
        this.admin = admin;
        addUserToChat(admin);
    }

    void addUserToChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user || u == admin) {
                u.getMessages(user.getName() + " -> " + u.getName() + ": " + message);
            }
        }
    }
}
