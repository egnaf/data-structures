package com.github.egnaf.structures;

public class LinkedList {
    class Node<T> {
        private Node<T> next;
        private T data;

        public Node() {
            this.next = null;
            this.data = null;
        }

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(Node<T> next, T data) {
            this.next = next;
            this.data = data;
        }

        public void add(Node<T> node) {
            Node<T> current = this;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            current.data = node.data;
        }

        public String display() {
            StringBuilder result = new StringBuilder();
            Node<T> current = this;

            while (current.next != null) {
                result.append(current.data);
                current = current.next;
            }

            return result.toString();
        }
    }
}
