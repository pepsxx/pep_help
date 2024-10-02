package suleimanov.design.patterns.behavioral.visitor;

public class DeveloperJunior implements Developer{

    @Override
    public void justDuIt(Code project) {
        System.out.println("Write bad class...");
    }

    @Override
    public void justDuIt(Database database) {
        System.out.println("Drop bad database...");
    }

    @Override
    public void justDuIt(Test test) {
        System.out.println("Write bad test...");

    }
}
