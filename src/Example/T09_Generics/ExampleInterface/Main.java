package Example.T09_Generics.ExampleInterface;

public class Main {
    public static void main(String[] args) {
        Unit<GunInterfaceCold> unit1 = new UnitCold<>("Рыцарь");
        Unit<GunInterfaceHott> unit2 = new UnitHott<>("Снайпер");
        Unit<GunInterfaceCold> unit3 = new UnitCold<>("Ниндзя");
        Unit<GunInterfaceHott> unit4 = new UnitHott<>("Штурмовик");
        System.out.println("------------------------------------------------------------------------------------------");


        unit1.setGun(new GunMech());
        unit2.setGun(new GunPistol());
        unit3.setGun(new GunNozh());
        unit4.setGun(new GunRocket());
        System.out.println("------------------------------------------------------------------------------------------");

        infoT(unit1, unit3);
        infoT(unit2, unit4);
//        infoT(unit1, unit2, unit3, unit4); // разные типы оружий
        System.out.println("------------------------------------------------------------------------------------------");

        info(unit1, unit2, unit3, unit4);
        System.out.println("------------------------------------------------------------------------------------------");

        infoExtends(unit1, unit2, unit3, unit4);
        System.out.println("------------------------------------------------------------------------------------------");

        infoSuperCold(unit1, unit3);
        infoSuperHott(unit2, unit4);
        System.out.println("------------------------------------------------------------------------------------------");

    }

    public static void info(Unit<?>... units) {
        for (Unit<?> unit : units) {
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }

    public static <T extends GunInterface> void infoT(Unit<T>... units) {
        for (Unit<T> unit : units) {
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }

    public static void infoExtends(Unit<? extends GunInterface>... units) {
        for (Unit<? extends GunInterface> unit : units) {
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }

    public static void infoSuperCold(Unit<? super GunInterfaceCold>... units) {
        for (Unit<? super GunInterfaceCold> unit : units) {
            unit.setGun(new GunMech());
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }

    public static void infoSuperHott(Unit<? super GunInterfaceHott>... units) {
        for (Unit<? super GunInterfaceHott> unit : units) {
            unit.setGun(new GunPistol());
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }
}
