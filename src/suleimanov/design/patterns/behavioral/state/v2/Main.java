package suleimanov.design.patterns.behavioral.state.v2;

public class Main {
    public static void main(String[] args) {

        Activity activity = new ActivitySlipping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            developer.justDoIt();
        }

    }
}
