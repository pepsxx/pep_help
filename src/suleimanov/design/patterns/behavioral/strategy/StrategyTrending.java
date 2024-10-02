package suleimanov.design.patterns.behavioral.strategy;

public class StrategyTrending implements Strategy {
    @Override
    public void justDoIt() {
        System.out.println("I'm trending");
    }
}
