package suleimanov.design.patterns.behavioral.command;

public class CommandInsert implements Command {
    Database database;

    public CommandInsert(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
