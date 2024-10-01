package suleimanov.design.patterns.generating.builder.v1;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void buildColor(String color) {
        car.setColor(color);
    }

    @Override
    public void buildType(String type) {
        car.setType(type);
    }

    @Override
    public void buildSit(String sit) {
        car.setSit(sit);
    }

    public CatAndManual getResult() {
        return car;
    }
}
