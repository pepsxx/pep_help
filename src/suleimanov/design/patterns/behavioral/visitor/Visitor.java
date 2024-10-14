package suleimanov.design.patterns.behavioral.visitor;

public interface Visitor {
    void justDuIt(ElementCode project);
    void justDuIt(ElementDatabase elementDatabase);
    void justDuIt(ElementTest test);
}
