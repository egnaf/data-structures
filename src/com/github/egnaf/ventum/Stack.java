package com.github.egnaf.ventum;

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
