package data_structures.lists.array_list;

import java.util.Arrays;

/**
 * Example of the ArrayList class.
 *
 * Time worst complexity:
 * add()      O(1)
 * insert()   O(n)
 * add()      O(1)
 * remove()   O(n)
 *
 *
 * @param <E> Elements data type
 */
public class MyArrayList<E> implements MyList<E> {

    private int size;

    private int capacity;

    private E[] elementData;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.size = 0;
        this.capacity = 10;
        this.elementData = (E[]) new Object[this.capacity];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.elementData = (E[]) new Object[this.capacity];
    }

    @Override
    public boolean add(E element) {
        if (this.size + 1 >= Integer.MAX_VALUE) return false;

        if (this.size < this.capacity) {
            this.elementData[this.size] = element;
        } else {
            this.capacity = this.capacity * 3 / 2;
            this.elementData[size] = element;
        }
        this.size++;
        return true;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= this.size) throw new ArrayIndexOutOfBoundsException(index);
        return this.elementData[index];
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= Integer.MAX_VALUE) return false;

        E[] leftArrayPart = (E[]) new Object[0];
        E[] rightArrayPart =  (E[]) new Object[0];

        if (index > 0) {
            leftArrayPart = (E[]) new Object[index];
            System.arraycopy(this.elementData, 0, leftArrayPart, 0, index);
        }

        if (index < this.size) {
            rightArrayPart = (E[]) new Object[this.size - index];
            System.arraycopy(this.elementData, index + 1, rightArrayPart, 0, rightArrayPart.length - 1);
        }

        System.arraycopy(leftArrayPart, 0, this.elementData, 0,  index);
        System.arraycopy(rightArrayPart, 0, this.elementData, index,  rightArrayPart.length);
        this.size--;

        return true;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @SuppressWarnings("unchecked")
    @Override
    public String toString() {
        E[] result = (E[]) new Object[this.size];
        System.arraycopy(this.elementData, 0, result, 0,result.length);
        return Arrays.toString(result);
    }
}

interface MyList<E> {

    /**
     * Add a new element to list.
     *
     * For example:
     * obj.add(new Object());
     *
     * Algorithm complexity:
     * Better: O(1)
     * Worst: O(n)
     *
     * @param element A new element
     * @return Returns true, if has been added, otherwise false
     */
    boolean add(E element);

    /**
     * Get the element by index.
     *
     * For example:
     * obj.add(1);
     *
     * Algorithm complexity:
     * Better: O(1)
     * Worst: O(1)
     *
     * @param index The index of the element that you want get
     * @return Returns the object with generic type E
     */
    E get(int index);

    /**
     * Delete the element by index.
     *
     * Algorithm complexity:
     * Better: O(1)
     * Worst: O(n)
     *
     * @param index The index of the element that you want remove
     * @return Returns true, if has been removed, otherwise false
     */
    boolean remove(int index);
}
