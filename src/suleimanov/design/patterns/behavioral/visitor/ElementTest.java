package suleimanov.design.patterns.behavioral.visitor;

public class ElementTest implements ProjectElement{

    @Override
    public void beWrittenBy(Visitor visitor) {
        visitor.justDuIt(this);
    }
}
