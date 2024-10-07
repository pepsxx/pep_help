package suleimanov.design.patterns.behavioral.visitor;

public interface Visitor {
    public void justDuIt(ElementCode project);
    public void justDuIt(ElementDatabase elementDatabase);
    public void justDuIt(ElementTest test);
}
