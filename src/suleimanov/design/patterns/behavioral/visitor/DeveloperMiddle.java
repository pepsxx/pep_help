package suleimanov.design.patterns.behavioral.visitor;

public class DeveloperMiddle implements Developer{

    @Override
    public void justDuIt(Code project) {
        System.out.println("Rewriter code...");
    }

    @Override
    public void justDuIt(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void justDuIt(Test test) {
        System.out.println("Rewriter Tests...");
    }

}
