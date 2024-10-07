package suleimanov.design.patterns.structural.decorator;

public class Decorator implements Developer {

    private Developer developer;

    public Decorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
