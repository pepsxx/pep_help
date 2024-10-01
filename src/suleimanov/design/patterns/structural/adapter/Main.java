package suleimanov.design.patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {

        Database database = new AdapterJavaToDataBase();

        database.insert();
        database.update();
        database.select();
        database.remove();

    }
}
