package example.T09_Generics.ExampleClass;

public class UnitCold<T extends GunCold> extends Unit<T>{
    public UnitCold(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
