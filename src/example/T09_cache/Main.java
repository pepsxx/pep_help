package example.T09_cache;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        SimpleCacheMyGeneric<String, String> cache = new SimpleCacheMyGeneric<>();

        cache.add("O", "One");
        cache.add("T", "Tue");
        cache.add("F", "Five");
        cache.add("S", "Six");
        System.out.println("cache.getAll() = " + cache.getAll());

        cache.getValueForKey("S");
        cache.getValueForKey("S");
        cache.getValueForKey("S");
        cache.getValueForKey("S");

        cache.getValueForKey("F");
        cache.getValueForKey("F");
        cache.getValueForKey("F");

        cache.getValueForKey("T");
        cache.getValueForKey("T");

        cache.getValueForKey("O");

        cache.remove();
    }
}
