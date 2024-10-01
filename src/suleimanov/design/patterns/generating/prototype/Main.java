package suleimanov.design.patterns.generating.prototype;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Прототип — это порождающий паттерн проектирования, который позволяет копировать объекты, не вдаваясь в подробности их реализации.
                """);

        Car car1 = new Car("Mazda", "3" , 2008);
        System.out.println("car1 = " + car1);
        System.out.println("-------------------------");

        Car car2 = (Car) car1.clonePrototype();
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("-------------------------");

        CarFactory carFactory = new CarFactory(car1);
        Car car3 = carFactory.cloneCar();
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("-------------------------");

    }
}
