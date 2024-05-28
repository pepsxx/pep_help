package Example.T03_Memory;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public static void main(String[] args) {
        // StackOverflowError
        stackFull();

        // OutOfMemoryError
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new Object());
        }
    }

    static void stackFull() {
        stackFull();
    }
}