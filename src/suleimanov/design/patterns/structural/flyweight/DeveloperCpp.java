package suleimanov.design.patterns.structural.flyweight;

public class DeveloperCpp extends FlyweightDeveloper {
    String code = "Write C++ code";

    @Override
    public void writeCode() {
        System.out.println(code);
    }
}
