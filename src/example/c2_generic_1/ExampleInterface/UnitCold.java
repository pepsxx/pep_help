package example.c2_generic_1.ExampleInterface;

public class UnitCold<T extends GunInterfaceCold> extends Unit<T> {
    public UnitCold(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
