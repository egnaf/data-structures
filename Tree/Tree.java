public interface Tree<K, V> {
    V get(Comparable<? super K> key);
    void add(Comparable<? super K> key, V value);
    void delete(Comparable<? super K> key);
}
