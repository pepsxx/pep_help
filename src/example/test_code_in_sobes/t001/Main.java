package example.test_code_in_sobes.t001;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Выводится рандомно, но всегда в одном порядке так как хеш-коды одинаковы,
        // а вывод все ровно идет по какому-то алгоритму
        Set<String> rivers = new HashSet<>(Arrays.asList("Волга", "Лена","Енисей"));
        System.out.println("Rivers = " + rivers);

    }
}
