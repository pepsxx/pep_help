package suleimanov.design.patterns.generating.prototype;

public class CarFactory {
    Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    Car cloneCar () {
        return (Car) car.clonePrototype();
    }
}
