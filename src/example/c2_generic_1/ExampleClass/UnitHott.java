package example.c2_generic_1.ExampleClass;

public class UnitHott<T extends GunHott> extends Unit<T>{
    public UnitHott(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
