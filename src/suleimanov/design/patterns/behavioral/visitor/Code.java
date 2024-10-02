package suleimanov.design.patterns.behavioral.visitor;


public class Code implements ProjectElement{

    @Override
    public void beWrittenBy(Developer developer) {
        developer.justDuIt(this);
    }
}
