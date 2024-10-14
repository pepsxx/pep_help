package suleimanov.design.patterns.generating.factoryMethod;

public class FabricDeveloperCpp implements fabricDeveloper {
    @Override
    public Developer createDeveloper() {
        return new DeveloperCpp();
    }
}
