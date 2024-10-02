package suleimanov.design.patterns.behavioral.command;

public class CommandUpdate implements Command {
    Database database;

    public CommandUpdate(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
