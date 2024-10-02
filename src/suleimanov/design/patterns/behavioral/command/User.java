package suleimanov.design.patterns.behavioral.command;

public class User {
    private Command command;

    public User(Command command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
