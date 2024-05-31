package Example.T09_Generics.Example;

public class UnitHott<T extends GunHott> extends Unit<T>{
    public UnitHott(String name) {
        super(name);
    }

    @Override
    public void setGun(T gun) {
        this.gun = gun;
    }
}
