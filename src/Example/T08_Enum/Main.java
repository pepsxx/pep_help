package Example.T08_Enum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------------------");
        Type type = Type.BIT_32;
        System.out.println("Arrays.toString(Type.values()) = " + Arrays.toString(Type.values())); // Вернет массив Enum(ов)
        System.out.println("Type.BIT_32.ordinal()          = " + Type.BIT_32.ordinal());          // Индекс
        System.out.println("Type.valueOf(\"BIT_32\")         = " + Type.valueOf("BIT_32")); // Возвращает объект по имени
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("type.name()     = " + type.name());     // Выведет скрытое поле name;
        System.out.println("type.toString() = " + type.toString()); // toString у Enum переопределен, вернет поле name
        System.out.println("type            = " + type);            // toString у Enum переопределен, вернет поле name
        System.out.println("type.name       = " + type.name);       // Выведет созданное поле name;
        System.out.println("type.getName()  = " + type.getName());  // Выведет созданное поле name;
        System.out.print("type.info()     : ");
        type.info();
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
