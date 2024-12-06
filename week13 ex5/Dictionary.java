import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary<K, V> {

    private Map<K, V> map;

    public Dictionary() {
        map = new HashMap<>();
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public Set<K> keys() {
        return map.keySet();
    }

    public Collection<V> values() {
        return map.values();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }
}
