package example.T15_Streams.v002;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("--------------------------------------------------");
        System.out.println("""
                Создание Stream:
                1. Из коллекции
                2. Из массива
                3. Из строки
                4. Из файла
                5. Генерирование
                6. Билдер""");
        // 1.
        Collection<Integer> list = List.of(11, 12, 13);
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);

        // 2.
        int[] numbers = {21, 22, 23};
        Stream<Integer> stream2 = Arrays.stream(numbers).boxed();
        stream2.forEach(System.out::println);

        // 3.
        String str = "Hello";
        IntStream stream3 = str.chars();
        stream3.forEach(System.out::println);

        //4.
        String fs = File.separator;
        File dir = new File("resources");
        Path path = Path.of(dir.getName(), "File1.txt");
        Stream stream = Files.lines(path);
        stream.forEach(System.out::println);

        //5.
        Stream stream5 = Stream.generate(() -> ThreadLocalRandom.current().nextInt(50, 60)).limit(3);
        stream5.forEach(System.out::println);

        //6.
        Stream.Builder builder = Stream.builder();
        builder.add(61);
        builder.add(62);
        builder.add(63);
        Stream stream6 = builder.build();
        stream6.forEach(System.out::println);
        System.out.println("--------------------------------------------------");

        System.out.println("""
                Промежуточные методы:
                1.  peek(Consumer)          Stateless
                2.  filter(Predicate)       Stateless
                3.  map(Function)           Stateless
                4.  flatMap()               Stateless
                5.  distinct()              Stateful
                6.  limit(n)                Stateful
                7.  skip(n)                 Stateful
                8.  sorted()                Stateful
                9.  takeWhile(Predicate)    Stateful
                10. dropWhile(Predicate)    Stateful""");
        List<List<Integer>> listOfLists = List.of(
                List.of(1, 2, 3),
                List.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                List.of(7, 8, 9));

        listOfLists.stream()
                .flatMap(List::stream)
                .peek(System.out::println)         // Выводятся все элементы на консоль, но только те которые пройдут limit
                .distinct()                        // Оставляем только уникальные значения
                .filter(i -> i % 2 == 0)           // Оставляем четные числа
                .map(i -> i * 2)                   // Умножаем каждое число на 2
                .limit(3)                  // Ограничиваем количество элементов до трех
                .skip(1)                        // Пропускаем первый элемент
                .sorted(Comparator.reverseOrder()) // Сортируем в обратном порядке
                .takeWhile(i -> i > 10)            // Включаем только те элементы, которые больше 10
                .forEach(System.out::println);     // Выводим результат
        System.out.println("--------------------------------------------------");

        System.out.println("""
                Терминальные методы:
                1.              forEach(Consumer) 
                2.              сollect(Collector) 
                3. Optional<T>  findFirst()
                4. Optional<T>  findAny()
                5. Optional<T>  reduce()
                6.              anyMatch(Predicate)
                7.              allMatch(Predicate)
                """);

        List<Integer> testList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.print("                                testList : ");
        System.out.println(testList);

        System.out.print("             forEach(System.out::print)  : ");
        testList.stream().forEach(System.out::print);
        System.out.println();

        System.out.print("             сollect(Collectors.toSet()) : ");
        Set<Integer> collect = testList.stream().collect(Collectors.toSet());
        collect.forEach(System.out::print);
        System.out.println();

        System.out.print("Optional<T>  findFirst()                 : ");
        testList.stream().findFirst().ifPresent(System.out::println);

        System.out.print("Optional<T>  findAny()                   : ");
        testList.stream().findAny().ifPresent(System.out::println);

        System.out.print("Optional<T>  reduce((i, j) -> i + j)     : ");
        testList.stream().reduce((i, j) -> i + j).ifPresent(System.out::println);

        System.out.print("             anyMatch(i -> i % 2 == 0)   : ");
        boolean b1 = testList.stream().anyMatch(i -> i % 2 == 0);
        System.out.println("b1 = " + b1);

        System.out.print("             allMatch(i -> i % 2 == 0)   : ");
        boolean b2 = testList.stream().allMatch(i -> i % 2 == 0);
        System.out.println("b2 = " + b2);

        System.out.println("--------------------------------------------------");
    }
}
