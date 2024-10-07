package example.T03_First;

public class Child extends Parent {

    static int staticChild = 3;

    static {
        testNumber = staticChild;
        System.out.println("3. Статические поля класса Child");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
        testNumber = 4;
        System.out.println("4. Статический блок инициализации класса Child");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
    }

    int nonStaticChild = 8;

    {
        testNumber = nonStaticChild;
        System.out.println("8. Нестатические поля класса Child");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
        testNumber = 9;
        System.out.println("9. Нестатический блок инициализации класса Child");
        System.out.println("testNumber = " + testNumber  );
        System.out.println("-------------------------");
    }

    public Child() {
        this.testNumber = 10;
        System.out.println("10. Конструктор класса Child");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
    }

    public void info () {
        System.out.println("staticParent    = " + staticParent);
        System.out.println("staticChild     = " + staticChild);
        System.out.println("nonStaticParent = " + nonStaticParent);
        System.out.println("nonStaticChild  = " + nonStaticChild);
        System.out.println("testNumber      = " + testNumber);
    }
}
