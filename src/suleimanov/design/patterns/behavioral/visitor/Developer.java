package suleimanov.design.patterns.behavioral.visitor;

public interface Developer {
    public void justDuIt(Code project);
    public void justDuIt(Database database);
    public void justDuIt(Test test);
}
