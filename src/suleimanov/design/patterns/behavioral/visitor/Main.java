package suleimanov.design.patterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {

        Project project = new Project();
        Developer junior = new DeveloperJunior();
        Developer middle = new DeveloperMiddle();

        System.out.println("Junior Action...");
        project.beWrittenBy(junior);
        System.out.println("-------------------------");
        System.out.println("Middle Action...");
        project.beWrittenBy(middle);

    }
}
