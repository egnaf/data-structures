import java.util.Arrays;

public class VectorImpl<T> implements Vector {

    private Object[] data;
    private int size;
    private int capacity;

    public VectorImpl() {
        capacity = 10;
        size = 0;
        data = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object element) {
        if (capacity <= size + 1) {
            Object[] tmp = new Object[size];
            System.arraycopy(data, 0, tmp, 0, size);
            data = new Object[capacity * 3 / 2];
            System.arraycopy(tmp, 0, data, 0, size);
            data[++size - 1] = element;
        } else {
            data[++size - 1] = element;
        }

        return data[size - 1].equals(element);
    }

    @Override
    public T get(int index) {
        if (index < size) {
            return (T) data[index];
        } else {
            throw new IllegalArgumentException("index is big then size");
        }
    }

    @Override
    public boolean remove(int index) {
        Object value = data[index];
        if (index < size) {
            Object[] tmp = new Object[size - index + 1];
            System.arraycopy(data, index + 1, tmp, 0, size - index + 1);
            System.arraycopy(tmp, 0, data, index, size - index + 1);
            size--;
        } else {
            throw new IllegalArgumentException("index is big then size");
        }
        return !data[index].equals(value);
    }

    @Override
    public String toString() {
        Object[] tmp = new Object[size];
        System.arraycopy(data, 0, tmp, 0, size);
        return Arrays.toString(tmp);
    }
}
