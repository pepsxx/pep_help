package suleimanov.design.patterns.builder.v2;

public class CarBuilderSport extends CarBuilder {
    @Override
    void buildSit() {
        car.setSit("2");
    }

    @Override
    void buildType() {
        car.setType("Sport");
    }

    @Override
    void buildColor() {
        car.setColor("Red");
    }
}
