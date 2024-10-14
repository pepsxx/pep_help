package suleimanov.design.patterns.structural.flyweight;

public class DeveloperJava extends FlyweightDeveloper {
    String code = "Write Java code";

    @Override
    public void writeCode() {
        System.out.println(code);
    }
}
