package suleimanov.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricFlyweight {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloper(String speciality) {
        Developer developer = developers.get(speciality);
        if (developer == null) {

            switch (speciality) {
                case "Java" -> {
                    System.out.println("Java developer hiring");
                    developer = new DeveloperJava();
                }
                case "C++" -> {
                    System.out.println("C++ developer hiring");
                    developer = new DeveloperCpp();
                }
            }

            developers.put(speciality, developer);
        }
        return developer;
    }
}
