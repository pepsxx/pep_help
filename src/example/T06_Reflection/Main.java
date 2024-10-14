package example.T06_Reflection;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

public class
Main {
    public static void main(String[] args) throws IllegalAccessException {

        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Nissan", "Qashqai", "2020");
        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("--------------------------------------------------");

        System.out.println("\ncar1.getClass() =\n" + car1.getClass());
        System.out.println("\ncar1.getClass().getAnnotation(Table.class) =\n" + car1.getClass().getAnnotation(Table.class));
        System.out.println("\nArrays.toString(car1.getClass().getDeclaredFields()) = fields1 =\n" + Arrays.toString(car1.getClass().getDeclaredFields()));
        System.out.println("--------------------------------------------------");

        Field[] fields1 = car1.getClass().getDeclaredFields();
        System.out.println("fields1[0].getAnnotation(Column.class)        = " + fields1[0].getAnnotation(Column.class));
        System.out.println("fields1[1].getAnnotation(Column.class)        = " + fields1[1].getAnnotation(Column.class));
        System.out.println("fields1[2].getAnnotation(Info.class)          = " + fields1[2].getAnnotation(Info.class));
        System.out.println("--------------------------------------------------");

        System.out.println("fields1[0].getAnnotation(Column.class).name() = " + fields1[0].getAnnotation(Column.class).name());
        System.out.println("fields1[1].getAnnotation(Column.class).name() = " + fields1[1].getAnnotation(Column.class).name());
        System.out.println("fields1[2].getAnnotation(Info.class).name()   = " + fields1[2].getAnnotation(Info.class).name());
        System.out.println("--------------------------------------------------");

        fields1[0].setAccessible(true);
        fields1[1].setAccessible(true);
        fields1[2].setAccessible(true);
        System.out.println("fields1[0].get(car1) = " + fields1[0].get(car1));
        System.out.println("fields1[1].get(car1) = " + fields1[1].get(car1));
        System.out.println("fields1[2].get(car1) = " + fields1[2].get(car1));
        System.out.println("--------------------------------------------------");

        System.out.println("generateInsert(car1) = " + generateInsert(car1));
        System.out.println("generateInsert(car2) = " + generateInsert(car2));

    }

    private static String generateInsert(Car car) {
        System.out.println("--------------------------------------------------");

        String template = "INSERT INTO %s.%s (%s) VALUES (%s);";  // Подготовка шаблона
        Table table = car.getClass().getAnnotation(Table.class);  // Получение Аннотации "Table"       в классе "Car"
        Field[] fields = car.getClass().getDeclaredFields();      // Получение задекламированных полей в классе "Car"

        String fieldNameColumn = Arrays.stream(fields)            // Стрим из полей класса "Car"
                .filter(f -> f.isAnnotationPresent(Column.class)) // Оставляем только поля с Аннотации "Column"
                .map(f -> f.getAnnotation(Column.class))          // Получение Аннотации "Column" из полей класса "Car"
                .map(Column::name)                                // Получение названий полей с Аннотацией "Column"
                .collect(Collectors.joining(", "));       // Формирование строки с разделителем ", "
        System.out.println("fieldNameColumn = " + fieldNameColumn);

        String fieldValuesColumn = Arrays.stream(fields)          // Стрим из полей класса "Car"
                .filter(f -> f.isAnnotationPresent(Column.class)) // Оставляем только поля с Аннотации "Column"
                .peek(f -> f.setAccessible(true))                 // Получение доступа к полям "private"
                .map(v -> {
                    try {
                        return v.get(car).toString();             //  Получение значений полей с Аннотацией "Column"
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(v -> "'" + v + "'")                          // Формирование строки обрамление в "'"
                .collect(Collectors.joining(", "));       // Формирование строки с разделителем ", "
        System.out.println("fieldValuesColumn = " + fieldValuesColumn);

        String fieldNameInfo = Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(Info.class))
                .map(f -> f.getAnnotation(Info.class))
                .map(Info::name)
                .collect(Collectors.joining(", "));
        System.out.println("fieldNameInfo = " + fieldNameInfo);

        String fieldValuesInfo = Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(Info.class))
                .peek(f -> f.setAccessible(true))
                .map(v -> {
                    try {
                        return v.get(car).toString();
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                })
                .map(v -> "'" + v + "'")
                .collect(Collectors.joining(", "));
        System.out.println("fieldValuesInfo = " + fieldValuesInfo);
        System.out.println("--------------------------------------------------");

        return String.format(template,table.schema(), table.name(), fieldNameColumn, fieldValuesColumn);
    }
}
