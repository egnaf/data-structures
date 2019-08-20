public interface Vector<T> {
    int size();
    boolean add(T element);
    T get(int index);
    boolean remove(int index);
}
