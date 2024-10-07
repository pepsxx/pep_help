package example.T03_First;

public class Parent {

    static int testNumber;

    static int staticParent = 1;


    static {
        testNumber = staticParent;
        System.out.println("1. Статические поля класса Parent");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
        testNumber = 2;
        System.out.println("2. Статический блок инициализации класса Parent");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
    }

    int nonStaticParent = 5;

    {
        testNumber = nonStaticParent;
        System.out.println("5. Нестатические поля класса Parent");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
        testNumber = 6;
        System.out.println("6. Нестатический блок инициализации класса Parent");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
    }

    public Parent() {
        this.testNumber = 7;
        System.out.println("7. Конструктор класса Parent");
        System.out.println("testNumber = " + testNumber);
        System.out.println("-------------------------");
    }

}
