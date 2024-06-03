package Example.T11_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listSource = List.of("Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять");     // Неизменяемый лист
        List<String> listTest = Arrays.asList("Ноль", "Один", "Два", "Три", "Четыре", "Пять", "Шесть", "Семь", "Восемь", "Девять"); //   Изменяемый лист
        List<String> list = new ArrayList<>(listSource);

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println("next = " + next);
            if (next == "Три") iterator.remove();
        }
        System.out.println("list.toString() = " + list.toString());
        System.out.println("1------------------------------------------------------------------------------------------");

        ListGeneric<String> listGeneric = new ListGeneric<>(3);
        listGeneric.add("Str1");
        listGeneric.add("Str2");
        listGeneric.add("Str3");

        for (Iterator<String> iterator = listGeneric.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println("next = " + next);
        }
        System.out.println("2------------------------------------------------------------------------------------------");

        for (String s : listGeneric) {
            System.out.println("s = " + s);
        }
        System.out.println("3------------------------------------------------------------------------------------------");

        listGeneric.iterator().forEachRemaining(System.out::println);
        System.out.println("4" +
                "------------------------------------------------------------------------------------------");
    }
}