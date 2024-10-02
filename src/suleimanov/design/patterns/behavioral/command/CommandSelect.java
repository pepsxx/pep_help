package suleimanov.design.patterns.behavioral.command;

public class CommandSelect implements Command {
    Database database;

    public CommandSelect(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
