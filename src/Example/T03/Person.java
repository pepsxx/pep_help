package Example.T03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Person {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        while (true){
            list.add(new Object());
        }
//        stackFull();
//        Stream.of
//        test(1, 2, 3);
    }

    static <T extends Number> void test(T... args) {
        System.out.println("args = " + Arrays.toString(args));
    }

    static void stackFull() {
//        System.out.print("A-");
        stackFull();
//        int i = 0;
//        while (true) {
//            i++;
//        }
    }
}