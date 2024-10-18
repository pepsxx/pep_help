package example.T09_cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleCacheMyGeneric<K, V> {

    private final Map<K, V> cache = new HashMap<>();
    private final Map<K, Integer> counterForGetRequest = new HashMap<>();

    void add(K key, V value) {
        cache.put(key, value);
    }

    V getValueForKey(K key) {
        if (!counterForGetRequest.containsKey(key)) {
            counterForGetRequest.put(key, 1);
        } else {
            counterForGetRequest.put(key, counterForGetRequest.get(key) + 1);
        }
        System.out.println("this.getCounterForGetRequest() = " + this.getCounterForGetRequest());
        return cache.get(key);
    }

    Map<K, V> getAll() {
        return cache;
    }

    Map<K, Integer> getCounterForGetRequest() {
        return counterForGetRequest;
    }

    void removeForKey(K key) {
        cache.remove(key);
    }

    void remove() {

        List<Integer> sortedListValueCounter =
                counterForGetRequest.values().stream()
                        .sorted()
                        .toList();

        Integer midleCountGetRecuest = sortedListValueCounter.get(sortedListValueCounter.size() / 2);

        counterForGetRequest.entrySet().stream()
                .filter(c -> c.getValue() < midleCountGetRecuest)
                .map(Map.Entry::getKey)
                .forEach(cache::remove);

        System.out.println("remove cache. cache = " + cache);

    }


}
