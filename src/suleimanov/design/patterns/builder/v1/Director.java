package suleimanov.design.patterns.builder.v1;

public class Director {
    void constructCarSport(Builder builder){
        builder.reset();
        builder.buildColor("Red");
        builder.buildSit("2");
        builder.buildType("Sport");

    };

    void constructCarStandard(Builder builder){
        builder.reset();
        builder.buildColor("Grey");
        builder.buildSit("5");
        builder.buildType("Family");

    };
}
