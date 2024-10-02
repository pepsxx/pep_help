package suleimanov.design.patterns.behavioral.state.v1;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof ActivitySlipping) {
            this.setActivity(new ActivityTrending());
        } else if (activity instanceof ActivityTrending) {
            this.setActivity(new ActivityCoding());
        } else if (activity instanceof ActivityCoding) {
            this.setActivity(new ActivityReading());
        } else if (activity instanceof ActivityReading) {
            this.setActivity(new ActivitySlipping());
        }
    }

    public void justDoIt() {
        this.activity.justDoIt();
    }
}
