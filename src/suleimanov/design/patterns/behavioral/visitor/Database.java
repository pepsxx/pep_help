package suleimanov.design.patterns.behavioral.visitor;

public class Database implements ProjectElement{

    @Override
    public void beWrittenBy(Developer developer) {
        developer.justDuIt(this);
    }
}
