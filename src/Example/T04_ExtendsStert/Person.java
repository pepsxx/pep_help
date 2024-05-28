package Example.T04_ExtendsStert;

public class Person {
    static {
        System.out.println("Person - static - Блок инициализации - Делается один раз");
    }

    {
        System.out.println("Person -          Блок инициализации - Сначала родители");
    }

    public Person() {
        System.out.println("Person -          Конструктор        - Сначала родители");
    }
}
