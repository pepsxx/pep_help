package example.T00_CodeTest.t002;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        // Что-то выполниться один раз
        User u = new User("1", 2);
        System.out.println("u = " + u);

        User u1 = Optional.ofNullable(u).orElse(new User("3", 4));
        System.out.println("u1 = " + u1);

        User u2 = Optional.ofNullable(u).orElseGet(() -> new User("5", 6));
        System.out.println("u2 = " + u2);

    }

}
