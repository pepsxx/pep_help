package example.T17_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>();
        test.put("a", 1);
        test.put("b", 2);
        test.put("c", 3);

        Set<String> strings = test.keySet();
        Collection<Integer> values = test.values();
        Set<Map.Entry<String, Integer>> entries = test.entrySet();

        strings.forEach(System.out::println);
        values.forEach(System.out::println);
        entries.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
