package example.c1_java_memory_exception;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // StackOverflowError
        stackFull();

        // OutOfMemoryError
        int i=0;
        List<Object> list = new ArrayList<>();
        while (true){
            list.add(new Object());
            i++;
        }
    }

    static void stackFull() {
        stackFull();
    }
    
}