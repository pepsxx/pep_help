package suleimanov.design.patterns.structural.composite.v1;


public class Main {
    public static void main(String[] args) {

        Team team = new Team();

        team.addDeveloper(new DeveloperJava());
        team.addDeveloper(new DeveloperJava());
        team.addDeveloper(new DeveloperCpp());

        team.creatProject();

    }
}
