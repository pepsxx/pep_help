package suleimanov.design.patterns.behavioral.visitor;

public class ElementCode implements ProjectElement{

    @Override
    public void beWrittenBy(Visitor visitor) {
        visitor.justDuIt(this);
    }
}
