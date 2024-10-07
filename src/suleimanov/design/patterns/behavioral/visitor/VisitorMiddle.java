package suleimanov.design.patterns.behavioral.visitor;

public class VisitorMiddle implements Visitor {

    @Override
    public void justDuIt(ElementCode project) {
        System.out.println("Rewriter code...");
    }

    @Override
    public void justDuIt(ElementDatabase elementDatabase) {
        System.out.println("Fixing database...");
    }

    @Override
    public void justDuIt(ElementTest test) {
        System.out.println("Rewriter Tests...");
    }

}
