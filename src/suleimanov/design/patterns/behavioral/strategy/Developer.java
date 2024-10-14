package suleimanov.design.patterns.behavioral.strategy;

public class Developer implements Strategy {
    Strategy strategy;

    public void setActivity(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void justDoIt() {
        this.strategy.justDoIt();
    }
}
