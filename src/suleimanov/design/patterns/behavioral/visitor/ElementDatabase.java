package suleimanov.design.patterns.behavioral.visitor;

public class ElementDatabase implements ProjectElement{

    @Override
    public void beWrittenBy(Visitor visitor) {
        visitor.justDuIt(this);
    }
}
