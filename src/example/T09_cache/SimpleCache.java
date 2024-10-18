package example.T09_cache;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class SimpleCache<K, V> {
    private final Map<K, V> cache;
    private final int maxSize;

    public SimpleCache(int maxSize) {
        this.maxSize = maxSize;
        this.cache = new LinkedHashMap<>(maxSize * 4 / 3, 0.75F, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > maxSize;
            }
        };
    }

    public synchronized void put(K key, V value) {
        Objects.requireNonNull(key, "Key must not be null");
        Objects.requireNonNull(value, "Value must not be null");
        cache.put(key, value);
    }

    public synchronized V get(K key) {
        return cache.get(key);
    }

    public synchronized V remove(K key) {
        return cache.remove(key);
    }

    public synchronized int size() {
        return cache.size();
    }
}
