package example.c2_generic_1.ExampleInterface;

public class UnitHott<T extends GunInterfaceHott> extends Unit<T> {
    public UnitHott(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
