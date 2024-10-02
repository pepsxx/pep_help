package suleimanov.design.patterns.behavioral.state.v2;

public class ActivityReading implements Activity {
    @Override
    public Activity justDoIt() {
        System.out.println("I'm reading!");
        return new ActivitySlipping();
    }
}
