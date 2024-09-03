package example.T06_Interfase;

public interface TestInterfaceMain extends TestInterfaceSub1, TestInterfaceSub2 {
    int YEAR = 2024;                           // public static final - уже подразумевается.

    default void printDefault() {              // default требует реализации в интерфейсе. public - уже подразумевается.
        System.out.print("Использован в default: ");
        printPrivate();
        System.out.println("default");
    }

    void print();                              // public - уже подразумевается.

    static void printStatic() {                // static - метод относиться к интерфейсу, а не к имплементирующему классу. public - уже подразумевается
        System.out.print("Использован в static: ");
        printPrivateStatic();
        System.out.println("static - не можем переопределить");
    }

    private static void printPrivateStatic() { // private static - доступен только в интерфейсе, в static.
        System.out.println("private static - доступен только в интерфейсе, в static");
    }
    private void printPrivate() {              // private - доступен только в интерфейсе.
        System.out.println("private - доступен только в в интерфейсе");
    }
}
