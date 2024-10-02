package suleimanov.design.patterns.behavioral.state.v2;

public class ActivitySlipping implements Activity {
    @Override
    public Activity justDoIt() {
        System.out.println("Slipping");
        return new ActivityTrending();
    }
}
