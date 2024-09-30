package suleimanov.design.patterns.builder.v2;

public class Car {
    private String sit;
    private String type;
    private String color;

    public void setSit(String sit) {
        this.sit = sit;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "sit='" + sit + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
