package suleimanov.design.patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {

        ChatText chat = new ChatText();

        User admin = new UserAdmin(chat, "admin");
        User user1 = new UserSimple(chat, "user1");
        User user2 = new UserSimple(chat, "user2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello Im User 1");
        System.out.println("-------------------------");
        admin.sendMessage("Hello Im Admin");

    }
}
