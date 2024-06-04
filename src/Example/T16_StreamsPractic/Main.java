package Example.T16_StreamsPractic;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Среднее всех нечетных, делящихся на 5.
        List<Integer> list1 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
        list1.stream()
                .filter(i -> i % 2 != 0)
                .filter(i -> i % 5 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
        System.out.println("------------------------------------------------------------------------------------------");

        // Найти уникальные строки длинной более 8 символов.
        List<String> list2 = List.of("0", "01", "012", "0123", "01234", "012345", "0123456", "01234567", "012345678", "0123456789", "0", "01", "012", "0123", "01234", "012345", "0123456", "01234567", "012345678", "0123456789");
        int size = list2.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println("size = " + size);

        long count = list2.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println("count = " + count);
        System.out.println("------------------------------------------------------------------------------------------");

        //Найти сумму значений длинна ключей которых меньше 7 символов.
        Map<String, Integer> map = Map.of(
                "0", 0,
                "01", 1,
                "012", 2,
                "0123", 3,
                "01234", 4,
                "012345", 5,
                "0123456", 6,
                "01234567", 7,
                "012345678", 8,
                "0123456789", 9
        );
        int sum = map.entrySet().stream()
                .filter(m -> m.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println("sum = " + sum);
        System.out.println("------------------------------------------------------------------------------------------");

        // Вывести конкатенацию значений
        List<Integer> list3 = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        String collect = list3.stream()
//                .map(String::valueOf)  // v1
                .map(Object::toString)   // v2
//                .collect(Collectors.joining());                                       // v1
                .collect(Collectors.joining("|", "Stat ", " End")); // v2
        System.out.println("collect = " + collect);
        System.out.println("------------------------------------------------------------------------------------------");

        // Вывести Имя самого старшего человека длина имени и фамилии которого не превышает 15 символов.
        List<Person> people = new ArrayList<>();
        people.add(new Person("Name1", "Last1", 15));
        people.add(new Person("Name12", "Last2", 25));
        people.add(new Person("Name123", "Last3", 35));
        people.add(new Person("Name1234", "Last4", 45));
        people.add(new Person("Name12345", "Last5", 55));
        people.add(new Person("Name123456", "Last6", 65));
        people.add(new Person("Name1234567", "Last7", 75));
        people.add(new Person("Name12345678", "Last8", 85));
        people.add(new Person("Name123456789", "Last9", 95));

        people.stream()
                .filter(p -> (p.getFirstName().length() + p.getLastName().length()) <= 15)
                .max(Comparator.comparing(Person::getAge))
                .map(p -> p.getFirstName() + " " + p.getLastName())
                .ifPresent(System.out::println);
        System.out.println("------------------------------------------------------------------------------------------");
    }
}
