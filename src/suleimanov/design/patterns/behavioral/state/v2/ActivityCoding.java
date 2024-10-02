package suleimanov.design.patterns.behavioral.state.v2;

public class ActivityCoding implements Activity {
    @Override
    public Activity justDoIt() {
        System.out.println("Coding just do it");
        return new ActivityReading();
    }
}
