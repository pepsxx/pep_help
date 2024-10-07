package suleimanov.design.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Developer developer1 = new DeveloperJunior();

        System.out.println(developer1.makeJob());

        Developer developer2 = new DecoratorMiddle(new DeveloperJunior());
        System.out.println(developer2.makeJob());

        Developer developer3 = new DecoratorSenior(new DecoratorMiddle(new DeveloperJunior()));
        System.out.println(developer3.makeJob());

        Developer developer4 = new DecoratorSenior(new DeveloperJunior());
        System.out.println(developer4.makeJob());

    }
}
