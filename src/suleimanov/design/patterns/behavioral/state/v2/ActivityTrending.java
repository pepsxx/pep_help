package suleimanov.design.patterns.behavioral.state.v2;

public class ActivityTrending implements Activity {
    @Override
    public Activity justDoIt() {
        System.out.println("I'm trending");
        return new ActivityCoding();
    }
}
