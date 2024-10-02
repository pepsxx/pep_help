package suleimanov.design.patterns.behavioral.state.v2;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void justDoIt() {
        this.activity = this.activity.justDoIt();
    }
}
