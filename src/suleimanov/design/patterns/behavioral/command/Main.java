package suleimanov.design.patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {

        Database database = new Database();

        Developer developer = new Developer(
                new CommandInsert(database),
                new CommandUpdate(database),
                new CommandSelect(database),
                new CommandDelete(database)

        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();

        System.out.println("-------------------------");

        User user = new User(new CommandSelect(database));
        user.execute();
        user = new User(new CommandDelete(database));
        user.execute();
    }
}
