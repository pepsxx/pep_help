package suleimanov.design.patterns.behavioral.strategy;

public class StrategyReading implements Strategy {
    @Override
    public void justDoIt() {
        System.out.println("I'm reading!");
    }
}
