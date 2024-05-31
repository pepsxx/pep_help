package Example.T09_Generics.ExampleInterface;

public class UnitCold<T extends GunInterfaceCold> extends Unit<T> {
    public UnitCold(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
