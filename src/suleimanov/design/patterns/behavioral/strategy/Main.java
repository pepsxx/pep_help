package suleimanov.design.patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setActivity(new StrategySlipping());
        developer.justDoIt();
        developer.setActivity(new StrategyTrending());
        developer.justDoIt();
        developer.setActivity(new StrategyCoding());
        developer.justDoIt();
        developer.setActivity(new StrategyReading());
        developer.justDoIt();
        developer.setActivity(new StrategySlipping());
        developer.justDoIt();

    }
}
