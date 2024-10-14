package suleimanov.design.patterns.generating.factoryMethod;

public class FabricDeveloperJava implements fabricDeveloper {
    @Override
    public Developer createDeveloper() {
        return new DeveloperJava();
    }
}
