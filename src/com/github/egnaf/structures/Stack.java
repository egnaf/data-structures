package com.github.egnaf.structures;

/**
 * Stack
 * @param <T>
 */
public interface Stack<T> {

    void push(T element);

    void pop();

    T peek();

    int size();

    int capacity();
}
