package suleimanov.design.patterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {

        Project project = new Project();
        Visitor junior = new VisitorJunior();
        Visitor middle = new VisitorMiddle();

        System.out.println("Junior Action...");
        project.beWrittenBy(junior);
        System.out.println("-------------------------");
        System.out.println("Middle Action...");
        project.beWrittenBy(middle);

    }
}
