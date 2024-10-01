package suleimanov.design.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {

        Developer developer = new DeveloperJunior();

        System.out.println("developer.makeJob() = " + developer.makeJob());

        Developer developer2 = new DeveloperMiddle(new DeveloperJunior());
        System.out.println("developer2.makeJob() = " + developer2.makeJob());

        Developer developer3 = new DeveloperSenior(new DeveloperMiddle(new DeveloperJunior()));
        System.out.println("developer3.makeJob() = " + developer3.makeJob());

        Developer developer4 = new DeveloperSenior(new DeveloperJunior());
        System.out.println("developer4.makeJob() = " + developer4.makeJob());

    }
}
