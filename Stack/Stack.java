public interface Stack<T> {
    int size();
    boolean push(T element);
    boolean pop();
    T peek();
}
