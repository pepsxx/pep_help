package example.c1_java_memory_exception;

import java.util.ArrayList;
import java.util.List;

public class Main {
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