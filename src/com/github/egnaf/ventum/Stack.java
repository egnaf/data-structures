package com.github.egnaf.ventum;

/**
 * Stack
 * @param <T>
 */
public interface Stack<T> {

    boolean push(T element);

    boolean pop();

    T peek();

    int size();

    int capacity();
}
