package suleimanov.design.patterns.structural.facade;

public class BugTracker {
    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive() {
        System.out.println("setActive");
        active = true;
    }

    public void setDisabled() {
        System.out.println("setDisabled");
        active = false;
    }
}
