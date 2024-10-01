package suleimanov.design.patterns.generating.builder.v1;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                https://www.youtube.com/watch?v=63_ExLjusac
                
                Строитель — это порождающий паттерн проектирования, 
                который позволяет создавать сложные объекты пошагово. 
                Строитель даёт возможность использовать один и тот же код строительства 
                для получения разных представлений объектов.""");

        Director director = new Director();

        CatAndManual result;
        CarBuilder carBuilder;
        ManualBuilder manualBuilder;

        carBuilder = new CarBuilder();
        manualBuilder = new ManualBuilder();
        director.constructCarSport(carBuilder);
        director.constructCarSport(manualBuilder);
        System.out.println("carBuilder.getResult()    = " + carBuilder.getResult());
        System.out.println("manualBuilder.getResult() = " + manualBuilder.getResult());

        carBuilder = new CarBuilder();
        manualBuilder = new ManualBuilder();
        director.constructCarStandard(carBuilder);
        director.constructCarStandard(manualBuilder);
        System.out.println("carBuilder.getResult()    = " + carBuilder.getResult());
        System.out.println("manualBuilder.getResult() = " + manualBuilder.getResult());

        carBuilder = new CarBuilder();
        carBuilder.reset();
        carBuilder.buildColor("Green");
        carBuilder.buildSit("4");
        carBuilder.buildType("Custom");
        System.out.println("carBuilder.getResult()    = " + carBuilder.getResult());

    }
}
