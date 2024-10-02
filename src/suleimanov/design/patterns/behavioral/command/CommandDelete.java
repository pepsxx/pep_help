package suleimanov.design.patterns.behavioral.command;

public class CommandDelete implements Command {

    public CommandDelete(Database database) {
        this.database = database;
    }

    Database database;

    @Override
    public void execute() {
        database.delete();
    }
}
