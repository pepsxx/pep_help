package Example.T12_Map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Ноль");
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");

        System.out.println("map.keySet()   = " + map.keySet());
        System.out.println("map.values()   = " + map.values());
        System.out.println("map.entrySet() = " + map.entrySet());
        System.out.println("map.containsKey(1) = " + map.containsKey(1));
        System.out.println("map.containsValue(\"Один\") = " + map.containsValue("Один"));
        System.out.println("map.isEmpty() = " + map.isEmpty()); // Пустая?

    }
}
