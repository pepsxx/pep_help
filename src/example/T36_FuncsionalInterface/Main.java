package example.T36_FuncsionalInterface;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Consumer<T>
        //Принимает: 1 <T>  Возвращает: -.
        Stream.of(1, 2, 3, 4, 5)
                .forEach((t) -> System.out.println(t));
        System.out.println("-------------------------");

        //Function<T, R>
        //функция
        //Принимает: 1 <T>  Возвращает: 1 <R>.
        Stream.of(1, 2, 3, 4, 5)
                .map((t) -> "String" + t)
                .forEach(System.out::println);
        System.out.println("-------------------------");

        //UnaryOperator<T>
        //Принимает: 1 <T>  Возвращает: 1 <T>.
        Stream.of(1, 2, 3, 4, 5)
                .map((t) -> t * 2)
                .forEach(System.out::println);
        System.out.println("-------------------------");

        //BinaryOperator<T>
        //Принимает: 2 <T>  Возвращает: 1 <T>.
        Stream.of(1, 2, 3, 4, 5)
                .reduce((t1, t2) -> t1 + t2)
                .ifPresent(System.out::println);
        System.out.println("-------------------------");

        //Supplier<T>
        //Принимает: -  Возвращает: 1 <T>.
        Stream.generate(() -> Math.random())
                .limit(10)
                .forEach(System.out::println);
        System.out.println("-------------------------");

        //Predicate<T>
        //Принимает: <T>  Возвращает: boolean.
        Stream.of(1, 2, 3, 4, 5)
                .filter((t) -> t % 2 == 0)
                .forEach(System.out::println);
        System.out.println("-------------------------");

    }
}
