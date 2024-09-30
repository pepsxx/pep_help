package suleimanov.design.patterns.builder.v1;

public interface Builder {
    void reset();
    void buildColor(String color);
    void buildType(String type);
    void buildSit(String sit);
    CatAndManual getResult();
}
