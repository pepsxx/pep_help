package suleimanov.design.patterns.behavioral.visitor;

public class Project implements ProjectElement{

    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new ElementCode(),
                new ElementDatabase(),
                new ElementTest()
        };
    }

    @Override
    public void beWrittenBy(Visitor visitor) {

        for (ProjectElement element : projectElements) {
            element.beWrittenBy(visitor);
        }

    }
}
