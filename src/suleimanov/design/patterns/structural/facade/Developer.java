package suleimanov.design.patterns.structural.facade;

public class Developer {
    public void doJobForDedLine (BugTracker bugTracker) {
        if (bugTracker.isActive()){
            System.out.println("Developer is Job");
        } else {
            System.out.println("Developer is not Job");
        }
    }
}
