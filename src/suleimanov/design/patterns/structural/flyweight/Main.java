package suleimanov.design.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        FabricFlyweight fabricFlyweight = new FabricFlyweight();

        List<Developer> developers = new ArrayList<Developer>();

        developers.add(fabricFlyweight.getDeveloper("Java"));
        developers.add(fabricFlyweight.getDeveloper("Java"));
        developers.add(fabricFlyweight.getDeveloper("Java"));
        developers.add(fabricFlyweight.getDeveloper("C++"));
        developers.add(fabricFlyweight.getDeveloper("C++"));
        developers.add(fabricFlyweight.getDeveloper("C++"));

        for (Developer developer : developers) {
            developer.writeCode();
        }
    }
}
