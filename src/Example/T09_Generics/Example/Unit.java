package Example.T09_Generics.Example;

public abstract class Unit<T extends Gun> {
    T gun;
    String name;

    public Unit(String name) {
        this.name = name;
    }

    public abstract void setGun(T gun);

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public T getGun() {
        return gun;
    }
}
