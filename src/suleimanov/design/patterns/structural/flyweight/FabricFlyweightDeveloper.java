package suleimanov.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricFlyweightDeveloper {

    private static final Map<String, FlyweightDeveloper> flyweightDevelopers = new HashMap<>();

    public FlyweightDeveloper getDeveloper(String speciality) {

        FlyweightDeveloper developer = flyweightDevelopers.get(speciality);

        if (developer == null) {

            switch (speciality) {
                case "Java" -> {
                    System.out.println("Java developer hiring");
                    developer = new DeveloperCpp();
                }
                case "C++" -> {
                    System.out.println("C++ developer hiring");
                    developer = new DeveloperCpp();
                }
            }

            flyweightDevelopers.put(speciality, developer);
        }
        return developer;
    }
}
