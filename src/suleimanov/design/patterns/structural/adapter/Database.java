package suleimanov.design.patterns.structural.adapter;

public interface Database {
    void insert();
    void update();
    void select();
    void remove();
}
