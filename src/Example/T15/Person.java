package Example.T15;

import Test001.Children;

import java.util.Optional;
import java.util.stream.Stream;

public class Person {
    Children children;
    public static void main(String[] args) {
        System.out.println("getName(null) = " + getName(null).orElse(" " +
                "" +
                ""));

    }

    public static Optional<String> getName(String name) {
        return Stream.ofNullable(name)
                .map(n -> n + "ff")
                .findAny();
    }
}
