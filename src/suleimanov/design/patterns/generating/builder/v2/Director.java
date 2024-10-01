package suleimanov.design.patterns.generating.builder.v2;

public class Director {
    CarBuilder carBuilder;

    Car build(CarBuilder carBuilder) {
        carBuilder.reset();
        carBuilder.buildSit();
        carBuilder.buildType();
        carBuilder.buildColor();
        return carBuilder.getResult();
    }
}
