package suleimanov.design.patterns.behavioral.visitor;

public class VisitorJunior implements Visitor {

    @Override
    public void justDuIt(ElementCode project) {
        System.out.println("Write bad class...");
    }

    @Override
    public void justDuIt(ElementDatabase elementDatabase) {
        System.out.println("Drop bad database...");
    }

    @Override
    public void justDuIt(ElementTest test) {
        System.out.println("Write bad test...");

    }
}
