# structures
The purpose of this repository is to give an idea of data structures with using Java.

- **[Arrays](#Arrays)**
  - [Simple array]()
  - [String]()
- **[Lists](#Lists)**
  - [Vector]()
  - [Stack]()
  - [Simple list]()
  - [Linked list]()
  - [Doubly linked list]()
- **[Queues](#Queues)**
  - [Queue]()
  - [Double-ended queue]()
- **[Trees](#Trees)**
  - [Binary tree]()
  - [Read-black tree]()
- **[Graphs](#Graphs)**
  - [Simple graph]()
  - [Undirected or directed graphs]()
  - [Cyclic or acyclic graphs]()
  - [Labeled graphs]()
  - [Weighted graphs]()
  - [Infinite graphs]()

## Arrays
### Simple array
Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
<img src="https://i.ibb.co/gFcN4Bg/Array.gif" alt="Array">

| ... | Access | Search | Insert | Delete |
| --- | --- | --- | --- | --- |
| Average | Θ(1) |	Θ(n) |	Θ(n) |	Θ(n) |
| Worst |	Θ(1) |	Θ(n) |	Θ(n) |	Θ(n) |

### String
A string datatype is a datatype modeled on the idea of a formal string. 
Strings are such an important and useful datatype that they are implemented in nearly every programming language. 
In some languages they are available as primitive types and in others as composite types.

| ... | Access | Search | Insert | Delete |
| --- | --- | --- | --- | --- |
| Average | Θ(1) |	Θ(n) |	Θ(n) |	Θ(n) |
| Worst |	Θ(1) |	Θ(n) |	Θ(n) |	Θ(n) |

## Lists
### Stack
In computer science, a **stack** is an abstract data type that serves as a collection of elements, with two principal operations:
- **push**, which adds an element to the collection, and
- **pop**, which removes the most recently added element that was not yet removed.

<img src="https://i.ibb.co/crnqVnJ/Stack.gif" alt="Stack">

| ... | Access | Search | Insert | Delete |
| --- | --- | --- | --- | --- |
| Average | Θ(n) |	Θ(n) |	Θ(1) |	Θ(1) |
| Worst |	Θ(n) |	Θ(n) |	Θ(1) |	Θ(1) |

### Linked list
a Linked list is a linear collection of data elements, whose order is not given by their physical placement in memory. 
Instead, each element points to the next. 
It is a data structure consisting of a collection of nodes which together represent a sequence.
```java
public class Node<T> {
    private Node<T> next = null;
    private T data;

    public Node(T data) {
        this.data = data;
    }

    void appendToTail(T data) {
        Node<T> endNode = new Node<>(data);
        Node<T> currentNode = this;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = endNode;
    }
}
```

Complexity:

| ... | Access | Search | Insert | Delete |
| --- | --- | --- | --- | --- |
| Average | Θ(n) |	Θ(n) |	Θ(1) |	Θ(1) |
| Worst |	Θ(n) |	Θ(n) |	Θ(1) |	Θ(1) |
## Queues
## Trees
## Graphs

## Contribute
For any problems, comments, or feedback please create an issue [here](https://github.com/egnaf/structures).
<br>

## Licence
This software is released under the [MIT](http://mitlicense.org) license.
