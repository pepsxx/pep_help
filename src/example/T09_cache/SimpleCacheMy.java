package example.T09_cache;

import java.util.*;

public class SimpleCacheMy {

    private final Map<String, String> cache = new HashMap<>();
    private final Map<String, Integer> counter = new HashMap<>();

    void add(String key, String value) {
        cache.put(key, value);
    }

    String getValueForKey(String key) {
        if (!counter.containsKey(key)) {
            counter.put(key, 1);
        } else {
            counter.put(key, counter.get(key) + 1);
        }
        return cache.get(key);
    }

    Map<String, String> getAll() {
        return cache;
    }

    Map<String, Integer> getCounter() {
        return counter;
    }

    void removeForKey(String key) {
        cache.remove(key);
    }

    void remove() {

        List<Integer> list = counter.values().stream()
                .sorted()
                .toList();

        Integer i = list.get(list.size() / 2);

        counter.entrySet().stream()
                .filter(q -> q.getValue() < i)
                .map(Map.Entry::getKey)
                .forEach(cache::remove);

        System.out.println("cache = " + cache);

    }


}
