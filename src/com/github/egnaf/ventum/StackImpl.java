package com.github.egnaf.ventum;

import java.util.Arrays;

public class StackImpl<T> implements  Stack {

    private Object[] data = null;

    private int size = 0;

    private int capacity = 10;

    public StackImpl() {
        data = new Object[capacity];
    }

    @Override
    public void push(Object element) {
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
    }

    @Override
    public void pop() {
        data[size - 1] = null;
        size--;
    }

    @Override
    public T peek() {
        return (T) data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public String toString() {
        Object[] tmp = new Object[size];
        System.arraycopy(data, 0, tmp, 0, size);
        return Arrays.toString(tmp);
    }
}
