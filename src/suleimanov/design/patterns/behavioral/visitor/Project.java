package suleimanov.design.patterns.behavioral.visitor;

public class Project implements ProjectElement{

    ProjectElement[] projectElements;

    public Project() {
        this.projectElements = new ProjectElement[] {
                new Code(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWrittenBy(Developer developer) {

        for (ProjectElement element : projectElements) {
            element.beWrittenBy(developer);
        }

    }
}
