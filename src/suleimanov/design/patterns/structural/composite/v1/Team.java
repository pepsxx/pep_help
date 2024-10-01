package suleimanov.design.patterns.structural.composite.v1;

import java.util.ArrayList;
import java.util.List;

public class Team {

    List<Developer> developers = new ArrayList<>();

    void addDeveloper(Developer developer) {

        developers.add(developer);

    }

    void removeDeveloper(Developer developer) {

        developers.remove(developer);

    }

    void creatProject() {

        System.out.println("Creating project");

        for (Developer developer : developers) {
            developer.writeCode();
        }

    }

}
