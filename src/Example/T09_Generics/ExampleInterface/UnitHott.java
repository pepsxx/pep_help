package Example.T09_Generics.ExampleInterface;

public class UnitHott<T extends GunInterfaceHott> extends Unit<T> {
    public UnitHott(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
