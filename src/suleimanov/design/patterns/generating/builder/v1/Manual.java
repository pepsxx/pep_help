package suleimanov.design.patterns.generating.builder.v1;

public class Manual implements CatAndManual {
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
        return "Man{" +
                "sit='" + sit + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
