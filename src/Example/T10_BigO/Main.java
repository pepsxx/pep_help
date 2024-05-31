package Example.T10_BigO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                1.1. Получение по элемента индексу.
                2.1. Получение элемента по значению.
                3.1. Добавление элемента (Начало).
                3.2. Добавление элемента (Середина).
                3.3. Добавление элемента (Конец).
                4.1. Удаление элемента (Начало).
                4.2. Добавление элемента (Середина).
                4.3. Добавление элемента (Конец).
                """);

        System.out.println("""
                |   O(1)   | 1
                | O(log n) | log n
                |   O(n)   | n
                |  O(n^2)  | n^2
                |  O(2^n)  | 2^n
                |  O(n!)   | n!
                """);
        System.out.println("""              
                           |   idx   |    val  |    +S   |    +M   |    +E   |    -S   |    -M   |    -E   |
                    Масcив |    1    |    n    |    1    |    1    |    1    |    1    |    1    |    1    |
                 ArrayList |    1    |    n    |    n    |    n    |   1/n   |    n    |    n    |    1    |
                LinkedList |    n    |    n    |    1    |    n    |    1    |    1    |    n    |    1    |
                       Set |         |         |         |         |         |         |         |         |
                       Map | 1/log n |  log n  | 1/log n | 1/log n | 1/log n | 1/log n | 1/log n | 1/log n |
                """);


    }
}
