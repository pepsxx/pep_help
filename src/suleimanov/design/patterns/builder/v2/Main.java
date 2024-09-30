package suleimanov.design.patterns.builder.v2;

public class Main {
    public static void main(String[] args) {

        // С директором
        Director director = new Director();
        CarBuilderSport carBuilderSport = new CarBuilderSport();
        Car carSport = director.build(carBuilderSport);
        System.out.println("carSport = " + carSport);

        // Без директора
        CarBuilderStandard carBuilderStandard = new CarBuilderStandard();
        carBuilderStandard.reset();
        carBuilderStandard.buildSit();
        carBuilderStandard.buildType();
        carBuilderStandard.buildColor();
        Car carStandard = carBuilderStandard.getResult();
        System.out.println("carStandard = " + carStandard);



    }
}
