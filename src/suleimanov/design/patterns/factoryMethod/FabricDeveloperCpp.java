package suleimanov.design.patterns.factoryMethod;

public class FabricDeveloperCpp implements AbstractFabric {
    @Override
    public AbstarctDeveloper createDeveloper() {
        return new DeveloperCpp();
    }
}
