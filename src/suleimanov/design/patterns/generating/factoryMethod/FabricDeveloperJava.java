package suleimanov.design.patterns.generating.factoryMethod;

public class FabricDeveloperJava implements AbstractFabric {
    @Override
    public AbstractDeveloper createDeveloper() {
        return new DeveloperJava();
    }
}
