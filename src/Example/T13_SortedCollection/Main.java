package Example.T13_SortedCollection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"); //   Изменяемый лист
        System.out.println("list1 = " + list1);

        Collections.sort(list1);

        System.out.println("list1 = " + list1);

        List<Person> list2 = Arrays.asList(new Person(2, "Tom"), new Person(3, "Bob"), new Person(1, "Den"));
        System.out.println("list2 = " + list2);
        Collections.sort(list2);
        System.out.println("list2 = " + list2);

        // v1
        Collections.sort(list2, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                ("String1").compareTo("String2"); // Уже реализован для строк
                return o1.getName().compareTo(o2.getName());
            }
        });

        // v2
        Collections.sort(list2, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        // v3
        Collections.sort(list2, Comparator.comparing(Person::getName));

        // v4
        list2.sort(Comparator.comparing(Person::getName));

        System.out.println("list2 = " + list2);
    }
}
