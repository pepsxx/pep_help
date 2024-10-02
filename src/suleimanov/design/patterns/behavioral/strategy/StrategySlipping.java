package suleimanov.design.patterns.behavioral.strategy;

public class StrategySlipping implements Strategy {
    @Override
    public void justDoIt() {
        System.out.println("Slipping");
    }
}
