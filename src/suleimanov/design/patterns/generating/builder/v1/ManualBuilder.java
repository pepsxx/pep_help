package suleimanov.design.patterns.generating.builder.v1;

public class ManualBuilder implements Builder {
    private Manual manual;

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void buildColor(String color) {
        manual.setColor(color);
    }

    @Override
    public void buildType(String type) {
        manual.setType(type);
    }

    @Override
    public void buildSit(String sit) {
        manual.setSit(sit);
    }

    public CatAndManual getResult() {
        return manual;
    }
}
