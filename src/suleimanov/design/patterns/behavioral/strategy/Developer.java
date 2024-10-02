package suleimanov.design.patterns.behavioral.strategy;

public class Developer {
    Strategy strategy;

    public void setActivity(Strategy strategy) {
        this.strategy = strategy;
    }

    public void justDoIt() {
        this.strategy.justDoIt();
    }
}
