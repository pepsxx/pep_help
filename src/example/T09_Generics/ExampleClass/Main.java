package example.T09_Generics.ExampleClass;

public class Main {
    public static void main(String[] args) {
        Unit<GunCold> unit1 = new UnitCold<>("Рыцарь");
        Unit<GunHott> unit2 = new UnitHott<>("Снайпер");
        Unit<GunCold> unit3 = new UnitCold<>("Ниндзя");
        Unit<GunHott> unit4 = new UnitHott<>("Штурмовик");
        System.out.println("------------------------------------------------------------------------------------------");


        unit1.setGun(new GunCold("Меч"));
        unit2.setGun(new GunHott("Винтовка"));
        unit3.setGun(new GunCold("Катана"));
        unit4.setGun(new GunHott("пулемёт"));
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
        for (Unit<? extends Gun> unit : units) {
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }
    public static void infoExtends(Unit<? extends Gun>... units) {
        for (Unit<? extends Gun> unit : units) {
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }
    public static void infoSuperCold(Unit<? super GunCold>... units) {
        for (Unit<? super GunCold> unit : units) {
            unit.setGun(new GunCold("Нож"));
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }
    public static void infoSuperHott(Unit<? super GunHott>... units) {
        for (Unit<? super GunHott> unit : units) {
            unit.setGun(new GunHott("Ракетница"));
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }
}
