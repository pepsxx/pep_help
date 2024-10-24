package suleimanov.design.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Developers fabricFlyweight = new Developers();

        List<FlyweightDeveloper> developers = new ArrayList<>();

        developers.add(fabricFlyweight.getDeveloper("Java"));
        developers.add(fabricFlyweight.getDeveloper("Java"));
        developers.add(fabricFlyweight.getDeveloper("Java"));
        developers.add(fabricFlyweight.getDeveloper("C++"));
        developers.add(fabricFlyweight.getDeveloper("C++"));
        developers.add(fabricFlyweight.getDeveloper("C++"));

        for (FlyweightDeveloper developer : developers) {
            developer.writeCode();
        }
    }
}
