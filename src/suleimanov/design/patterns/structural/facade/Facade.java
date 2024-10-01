package suleimanov.design.patterns.structural.facade;

public class Facade {
    private Job job = new Job();
    private BugTracker bugTracker = new BugTracker();
    private Developer developer = new Developer();

    public void solveProblems(){
        job.doJob();
        bugTracker.setActive();
        developer.doJobForDedLine(bugTracker);
    }
}
