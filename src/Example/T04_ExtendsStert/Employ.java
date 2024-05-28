package Example.T04_ExtendsStert;

public class Employ extends Person {
    static {
        System.out.println("Employ - static - Блок инициализации - Делается один раз");
    }

    {
        System.out.println("Employ          - Блок инициализации - Потом наследники");
    }
    public Employ() {

        System.out.println("Employ          - Конструктор        - Потом наследники");
    }
}
