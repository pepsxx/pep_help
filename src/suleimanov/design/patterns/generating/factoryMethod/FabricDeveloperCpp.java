package suleimanov.design.patterns.generating.factoryMethod;

public class FabricDeveloperCpp implements AbstractFabric {
    @Override
    public AbstractDeveloper createDeveloper() {
        return new DeveloperCpp();
    }
}
