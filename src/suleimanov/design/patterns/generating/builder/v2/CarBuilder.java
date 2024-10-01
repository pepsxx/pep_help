package suleimanov.design.patterns.generating.builder.v2;

public abstract class CarBuilder {
    protected Car car;

    void reset() {
        car = new Car();
    }

    abstract void buildSit();

    abstract void buildType();

    abstract void buildColor();

    Car getResult() {
        return car;
    }
}
