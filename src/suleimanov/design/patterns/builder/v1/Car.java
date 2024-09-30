package suleimanov.design.patterns.builder.v1;

public class Car implements CatAndManual {
    String sit;
    String color;
    String type;

    public void setSit(String sit) {
        this.sit = sit;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "sit='" + sit + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
