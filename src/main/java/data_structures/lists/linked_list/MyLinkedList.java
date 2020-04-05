package data_structures.lists.linked_list;

public class MyLinkedList<E> implements MyList<E> {

    Node head;
    Node tail;

    public MyLinkedList() {
    }

    class Node {
        E data;
        Node next;
        Node previous;
    }

    @Override
    public boolean add(E element) {

        Node node = new Node();
        node.data = element;

        if (head == null) {
            head = node;
        } else if (tail == null) {
            tail = node;
            tail.previous = head;
        } else {
            tail.next = node;
        }
        return true;
    }

    @Override
    public E get(int index) { // index = 3 : [0] [1] [2] [3]

        if (head == null) {
            return null;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            return current.data;
        }
    }

    @Override
    public boolean remove(int index) {
        return false;
    }
}

interface MyList<E> {

    boolean add(E element);
    E get(int index);
    boolean remove(int index);
}
