package example.T44;

import java.util.stream.Stream;

public class Person {
    public static void main(String[] args) {

        final String bbb = "b";

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(i -> i % 2 != 0)
                .map(i -> i * 10)
                .map(Object::toString)
                .map(s -> s + "a" + bbb)
                .forEach(s -> System.out.println(s));
        System.out.println("list = ");
    }

    public int sumPep(int a, int b) {
        return a+b;
    }
}
