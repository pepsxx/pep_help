package suleimanov.design.patterns.builder.v2;

public class CarBuilderStandard extends CarBuilder {
    @Override
    void buildSit() {
        car.setSit("4");
    }

    @Override
    void buildType() {
        car.setType("Standard");
    }

    @Override
    void buildColor() {
        car.setColor("Grey");
    }
}
