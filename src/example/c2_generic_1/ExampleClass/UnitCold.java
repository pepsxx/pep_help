package example.c2_generic_1.ExampleClass;

public class UnitCold<T extends GunCold> extends Unit<T>{
    public UnitCold(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
