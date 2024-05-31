package Example.T09_Generics.Example;

public class Main {
    public static void main(String[] args) {
        Unit<GunCold> unit1 = new UnitCold<>("Рыцарь");
        Unit<GunHott> unit2 = new UnitHott<>("Снайпер");
        Unit<GunCold> unit3 = new UnitCold<>("Ниндзя");
        Unit<GunHott> unit4 = new UnitHott<>("Штурмовик");

        unit1.setGun(new GunCold("Меч"));
        unit2.setGun(new GunHott("Винтовка"));
        unit3.setGun(new GunCold("Катана"));
        unit4.setGun(new GunHott("пулемёт"));

        infos(unit1, unit2, unit3, unit4);

    }

    public static void infos(Unit<? extends Gun>... units) {
        for (Unit<? extends Gun> unit : units) {
            System.out.println(unit.getName() + " - " + unit.getGun().getName());
        }
    }
}
