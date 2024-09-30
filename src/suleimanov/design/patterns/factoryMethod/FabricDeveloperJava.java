package suleimanov.design.patterns.factoryMethod;

public class FabricDeveloperJava implements AbstractFabric {
    @Override
    public AbstarctDeveloper createDeveloper() {
        return new DeveloperJava();
    }
}
