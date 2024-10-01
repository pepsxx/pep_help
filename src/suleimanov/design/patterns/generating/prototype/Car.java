package suleimanov.design.patterns.generating.prototype;

public class Car implements Prototype {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public Object clonePrototype() {
        return new Car(make, model, year);
    }
}
