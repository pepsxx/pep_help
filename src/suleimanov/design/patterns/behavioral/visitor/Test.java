package suleimanov.design.patterns.behavioral.visitor;

public class Test implements ProjectElement{

    @Override
    public void beWrittenBy(Developer developer) {
        developer.justDuIt(this);
    }
}
