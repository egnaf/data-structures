import java.util.Arrays;

public class StackImpl<T> implements  Stack {

    private Object[] data;

    private int size;

    private int capacity;

    public StackImpl() {
        capacity = 10;
        size = 0;
        data = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean push(Object element) {
        if (capacity <= size + 1) {
            Object[] tmp = new Object[size];
            System.arraycopy(data, 0, tmp, 0, size);
            data = new Object[capacity * 3 / 2];
            System.arraycopy(tmp, 0, data, 0, size);
            data[size - 1] = element;
            size++;
        } else {
            data[++size - 1] = element;
        }
        return data[size - 1].equals(element);
    }

    @Override
    public boolean pop() {
        data[size - 1] = null;
        size--;
        return true;
    }

    @Override
    public T peek() {
        return (T) data[size - 1];
    }

    @Override
    public String toString() {
        Object[] tmp = new Object[size];
        System.arraycopy(data, 0, tmp, 0, size);
        return Arrays.toString(tmp);
    }
}
